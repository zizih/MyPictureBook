package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.Q33Sports;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.Q37Music;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.Q41Drawing;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.Q45Outdoor;
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

        sub_locations = new int[][]{
                getResources().getIntArray(R.array.hobbies_sports_location)
                , getResources().getIntArray(R.array.holiday_mountains_location)
                , getResources().getIntArray(R.array.hobbies_draw_location)
                , getResources().getIntArray(R.array.hobbies_outdoor_location)
        };
        sub_medias = new int[]{
                R.string.mp3_hobby_002, R.string.mp3_hobby_048, R.string.mp3_hobby_093, R.string.mp3_hobby_138
        };
        sub_clzz = new Class[]{
                Q33Sports.class, Q37Music.class, Q41Drawing.class, Q45Outdoor.class
        };
    }
}
