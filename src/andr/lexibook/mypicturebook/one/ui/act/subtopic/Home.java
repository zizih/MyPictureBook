package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BathroomQ05;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BedroomQ09;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.GardenQ13;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.KitchenQ01;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 6/23/13.
 */
public class Home extends TopicBase implements MediaPlayer.OnCompletionListener {

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

        bee.setMovieAsset(getString(R.string.gif_home_bee));
        butterfly.setMovieAsset(getString(R.string.gif_home_butterfly));
        dog.setMovieAsset(getString(R.string.gif_home_dog));

        sub_locations = new int[][]{
                getResources().getIntArray(R.array.home_kitchen)
                , getResources().getIntArray(R.array.home_bedroom)
                , getResources().getIntArray(R.array.home_bathroom)
                , getResources().getIntArray(R.array.home_garden)
        };
        sub_medias = new int[]{
                R.string.mp3_city_002, R.string.mp3_city_047, R.string.mp3_city_092, R.string.mp3_city_137
        };
        sub_clzz = new Class[]{
                KitchenQ01.class, BathroomQ05.class, BedroomQ09.class, GardenQ13.class
        };
    }

}
