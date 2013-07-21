package andr.lexibook.mypicturebook.one.control;

import andr.lexibook.mypicturebook.one.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by rain on 5/18/13.
 */
public class MediaFactory {

    private Activity ctx;
    private static MediaFactory instance;
    private String langPath;
    private MediaPlayer sfxOn;
    private MediaPlayer media;
    private AssetFileDescriptor descriptor;

    private final int DEU = 1;
    private final int ENG = 2;
    private final int ESP = 3;
    private final int FRA = 4;


    public MediaFactory(Context ctx) {
        this.ctx = (Activity) ctx;
        this.langPath = ctx.getResources().getString(R.string.mp3_lang_default);
    }

    public static MediaFactory getInstance(Context ctx) {
        if (instance == null) instance = new MediaFactory(ctx);
        return instance;
    }

    private MediaPlayer getMedia(String fileName) {
        MediaPlayer mPlayer = new MediaPlayer();
        try {
            System.out.println("LangPath: " + langPath + fileName);
            descriptor = ctx.getAssets().openFd(langPath + fileName);
            mPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getDeclaredLength());
            descriptor.close();
        } catch (IOException e) {
            System.out.println("Err: " + e.getCause());
            e.printStackTrace();
            return null;
        }
        return mPlayer;
    }

    public MediaPlayer getMedia(int pathId) {
        if (media == null)
            return getMedia(ctx.getString(pathId));
        try {
            media.reset();
            media.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getDeclaredLength());
            descriptor.close();
            return media;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MediaPlayer getSfxOn(int langId) {
        return toLang(langId).getMedia(ctx.getResources().getString(R.string.mp3_sfx_on));
    }

    public MediaPlayer getSfxOn() {
        if (sfxOn == null)
            sfxOn = toLang(FRA).getMedia(ctx.getResources().getString(R.string.mp3_sfx_on));
        return sfxOn;
    }


    /**
     * set Language
     */

    public MediaFactory setLang(String langPath) {
        this.langPath = langPath;
        return this;
    }

    public MediaFactory toLang(int langId) {
        switch (langId) {
            case DEU:
                return setLang(ctx.getResources().getString(R.string.mp3_lang_deu));
            case ENG:
                return setLang(ctx.getResources().getString(R.string.mp3_lang_eng));
            case ESP:
                return setLang(ctx.getResources().getString(R.string.mp3_lang_esp));
            case FRA:
                return setLang(ctx.getResources().getString(R.string.mp3_lang_fra));
        }
        return setLang(ctx.getResources().getString(R.string.mp3_lang_default));
    }

}
