package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

/**
 * Created by rain on 6/23/13.
 */
public class Home extends BaseActivity {

    private GifMovieView bee;
    private GifMovieView butterfly;
    private GifMovieView dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        bee = (GifMovieView) findViewById(R.id.gif_bee);
        butterfly = (GifMovieView) findViewById(R.id.gif_butterfly);
        dog = (GifMovieView) findViewById(R.id.gif_dog);

        bee.setMovieAsset(getString(R.string.fra_home_bee));
        butterfly.setMovieAsset(getString(R.string.fra_home_butterfly));
        dog.setMovieAsset(getString(R.string.fra_home_dog));
    }
}
