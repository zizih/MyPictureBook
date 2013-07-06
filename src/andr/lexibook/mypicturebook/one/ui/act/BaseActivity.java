package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.control.MediaFactory;
import andr.lexibook.mypicturebook.one.control.SoundFactory;
import andr.lexibook.mypicturebook.one.util.ViewUtil;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.*;
import android.widget.AbsoluteLayout;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by rain on 6/22/13.
 */
@SuppressWarnings("deprecation")
public class BaseActivity extends Activity implements MediaPlayer.OnCompletionListener {

    private AnimationDrawable ad;
    private Intent toPage;
    private MenuInflater inflater;

    public final int DEU = 1;
    public final int ENG = 2;
    public final int ESP = 3;
    public final int FRA = 4;
    public MediaPlayer sfxOn;

    public AbsoluteLayout.LayoutParams params;
    public MediaFactory mediaFactory;
    public SoundFactory soundFactory;
    public SoundPool pool;
    public SoundPool priorityPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toPage = new Intent();
        inflater = getMenuInflater();
        mediaFactory = MediaFactory.getInstance(this);
        sfxOn = mediaFactory.getSfxOn();
        soundFactory = SoundFactory.getInstance(this);
        pool = soundFactory.getPool();
        priorityPool = soundFactory.getPriorityPool();
    }

    public void toPage(Class<?> cls) {
        toPage.setClass(this, cls);
        startActivity(toPage);
    }

    public void play(MediaPlayer media) {
        if (media.isPlaying())
            media.release();
        try {
            media.prepare();
            media.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        inflater.inflate(R.menu.language, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "not support!", 1000).show();
        return true;
    }

    public float getWidthScale() {
        return ViewUtil.getInstance(this).getWidthScale();
    }

    public float getHeightScale() {
        return ViewUtil.getInstance(this).getHeightScale();
    }

    public float getDimens(int dimensId) {
        return getResources().getDimension(dimensId);
    }

    public boolean checkLocation(MotionEvent event, int[] location) {
        if (event.getX() > location[0] * getWidthScale()
                && event.getY() > location[1] * getHeightScale()
                && event.getX() < location[2] * getWidthScale()
                && event.getY() < location[3] * getHeightScale()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0)
            finish();
        return false;
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("OnDestroy: " + getClass().getName());
    }
}
