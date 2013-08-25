package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.JobsQ29;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.SchoolQ25;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.ShopsQ21;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.TransportationQ17;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 6/23/13.
 */
public class City extends TopicBase implements MediaPlayer.OnCompletionListener {

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

        sub_locations = new int[][]{
                getResources().getIntArray(R.array.city_school_location)
                , getResources().getIntArray(R.array.city_jobs_location)
                , getResources().getIntArray(R.array.city_shops_location)
                , getResources().getIntArray(R.array.city_transportation_location)
        };
        sub_medias = new int[]{
                R.string.mp3_city_002, R.string.mp3_city_047, R.string.mp3_city_092, R.string.mp3_city_137
        };
        sub_clzz = new Class[]{
                TransportationQ17.class, ShopsQ21.class, SchoolQ25.class, JobsQ29.class
        };
    }
}
