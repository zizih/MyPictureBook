package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

/**
 * Created by rain on 6/23/13.
 */
public class City extends SubBase {

    private GifMovieView bee;
    private GifMovieView dog;
    private GifMovieView elephant;
    private GifMovieView baby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city);

        bee = (GifMovieView) findViewById(R.id.gif_bee);
        dog = (GifMovieView) findViewById(R.id.gif_dog);
        elephant = (GifMovieView) findViewById(R.id.gif_elephant);
        baby = (GifMovieView) findViewById(R.id.gif_baby);

        bee.setMovieAsset(getString(R.string.gif_city_bee));
        dog.setMovieAsset(getString(R.string.gif_city_dog));
        elephant.setMovieAsset(getString(R.string.gif_city_elephant));
        baby.setMovieAsset(getString(R.string.gif_city_baby));
    }

}
