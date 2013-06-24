package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.City;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Hobbies;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Holiday;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 6/23/13.
 */
public class Discovery extends BaseActivity {

    private GifMovieView topics;
    private GifMovieView smoke;
    private int[] home;
    private int[] act;
    private int[] hol;
    private int[] city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discovery);
        home = getResources().getIntArray(R.array.dis_home);
        act = getResources().getIntArray(R.array.dis_act);
        hol = getResources().getIntArray(R.array.dis_hol);
        city = getResources().getIntArray(R.array.dis_city);

        topics = (GifMovieView) findViewById(R.id.gif_dis_topics);
        smoke = (GifMovieView) findViewById(R.id.gif_dis_smoke);

        topics.setMovieAsset(getString(R.string.gif_discovery_topics));
        smoke.setMovieAsset(getString(R.string.gif_discovery_smoke));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (checkLocation(event, home))
            toPage(Home.class);
        if (checkLocation(event, act))
            toPage(Hobbies.class);
        if (checkLocation(event, hol))
            toPage(Holiday.class);
        if (checkLocation(event, city))
            toPage(City.class);
        return super.onTouchEvent(event);
    }


}
