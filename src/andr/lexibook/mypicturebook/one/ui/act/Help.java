package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;

public class Help extends BaseActivity {

    private GifMovieView help;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        help = (GifMovieView) findViewById(R.id.gif_mode_help);
        help.setMovieAsset(getString(R.string.gif_help));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                System.gc();
            }
        }, 62500);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            finish();
        }
        return super.onTouchEvent(event);
    }

}
