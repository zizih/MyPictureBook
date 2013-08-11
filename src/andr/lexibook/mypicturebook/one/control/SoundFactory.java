package andr.lexibook.mypicturebook.one.control;

import andr.lexibook.mypicturebook.one.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.io.IOException;

/**
 * User: rain
 * Date: 5/14/13
 * Time: 2:41 PM
 */
@SuppressWarnings("AndroidLintNewApi")
public class SoundFactory {

    private Activity ctx;
    private SoundPool pool;
    private SoundPool priorityPool;
    private String langPath;
    public int sfxOn_soundId = -1;

    private static SoundFactory instance;


    public static SoundFactory getInstance(Context context) {
        if (instance == null)
            instance = new SoundFactory(context);
        return instance;
    }

    public SoundFactory(Context ctx) {
        this.ctx = (Activity) ctx;
        this.pool = new SoundPool(1, AudioManager.STREAM_SYSTEM, 0);
        this.priorityPool = new SoundPool(1, AudioManager.STREAM_SYSTEM, 0);
        this.langPath = ctx.getString(R.string.mp3_lang_fra);
    }

    /**
     * for answer
     *
     * @param pathId
     * @param priority
     * @return
     */
    public int getSound(int pathId, int priority) {
        try {
            return pool.load(ctx.getAssets().openFd(langPath + ctx.getString(pathId)), priority);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Load Sound Err: " + e.getCause() + " From: " + langPath + ctx.getString(pathId));
            return 0;
        }
    }

    public SoundPool getPool() {
        return pool;
    }

    public SoundPool getPriorityPool() {
        return priorityPool;
    }

    /**
     * for question or other
     *
     * @param pathId
     * @return
     */
    public int getPrioritySound(int pathId) {
        try {
            return priorityPool.load(ctx.getAssets().openFd(langPath + ctx.getString(pathId)), 2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Load Sound Err: " + e.getCause() + " From: " + langPath + ctx.getString(pathId));
            return 0;
        }
    }

    public int getSfxOnSoundId() {
        if (sfxOn_soundId == -1)
            sfxOn_soundId = getPrioritySound(R.string.mp3_sfx_on);
        return sfxOn_soundId;
    }


    public SoundFactory setLang(String langPath) {
        this.langPath = langPath;
        return getInstance(ctx);
    }

}
