package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.view.MotionEvent;

public class Mode extends BaseActivity {

    private GifMovieView mode_discovery;
    private GifMovieView mode_quiz;
    private int[] dis_location;
    private int[] quiz_location;
    private int[] help_location;
    private int[] exit_location;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode);
        dis_location = getResources().getIntArray(R.array.mode_dis);
        quiz_location = getResources().getIntArray(R.array.mode_quiz);
        exit_location = getResources().getIntArray(R.array.mode_exit);
        help_location = getResources().getIntArray(R.array.mode_help);

        mode_discovery = (GifMovieView) findViewById(R.id.gif_mode_discovery);
        mode_quiz = (GifMovieView) findViewById(R.id.gif_mode_quiz);

        mode_discovery.setMovieAsset(getString(R.string.gif_mode_discovery));
        mode_quiz.setMovieAsset(getString(R.string.gif_mode_quiz));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (checkLocation(event, dis_location))
            toPage(Discovery.class);
        if (checkLocation(event, quiz_location)) {
        }
        if (checkLocation(event, exit_location))
            toPage(Exit.class);
        if (checkLocation(event, help_location))
            toPage(Help.class);
        return super.onTouchEvent(event);
    }
}
