package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;

public class Welcome extends BaseActivity {

    private GifMovieView play;
    private int[] play_location;
    private MediaPlayer main;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        play_location = getResources().getIntArray(R.array.wel_play);

        play = (GifMovieView) findViewById(R.id.gif_welcome_play);
        play.setMovieAsset(getString(R.string.gif_welcome_play));

        sfxOn = mediaFactory.getSfxOn();
        main = mediaFactory.getMedia(R.string.mp3_main_001);
        play(sfxOn);
        sfxOn.setOnCompletionListener(this);
        sfxOn.setLooping(true);
        sfxOn.setVolume((float) .2, (float) .2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                play(main);
            }
        }, 1000);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        super.onCompletion(mp);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                play(mediaFactory.getMedia(R.string.mp3_main_002));
            }
        }, 1000);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (checkLocation(event, play_location))
            toPage(Mode.class);
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        if (main != null) {
            main.release();
        }
        finish();
    }

}
