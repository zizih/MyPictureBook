package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

/**
 * Created by rain on 6/23/13.
 */
public class Hobbies extends TopicBase {

    private GifMovieView ball;
    private GifMovieView mouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hobbies);

        ball = (GifMovieView) findViewById(R.id.gif_ball);
        mouse = (GifMovieView) findViewById(R.id.gif_mouse);

        ball.setMovieAsset(getString(R.string.gif_hobbies_ball));
        mouse.setMovieAsset(getString(R.string.gif_hobbies_mouse));
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        onDestroy();
    }
}
