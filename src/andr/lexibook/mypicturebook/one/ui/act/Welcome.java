package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.view.MotionEvent;

public class Welcome extends BaseActivity {

    private GifMovieView play;
    private int[] play_lication;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        play_lication = getResources().getIntArray(R.array.wel_play);

        play = (GifMovieView) findViewById(R.id.gif_welcome_play);
        play.setMovieAsset(getString(R.string.gif_welcome_play));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (checkLocation(event, play_lication))
            toPage(Mode.class);
        return super.onTouchEvent(event);
    }
}
