package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.City;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Hobbies;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Holiday;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

    private int homeSoundId;
    private int hobbSoundId;
    private int holSoundId;
    private int citySoundId;

    private Intent toPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discovery);
        toPage = new Intent();
        home = getResources().getIntArray(R.array.dis_home);
        act = getResources().getIntArray(R.array.dis_act);
        hol = getResources().getIntArray(R.array.dis_hol);
        city = getResources().getIntArray(R.array.dis_city);

        topics = (GifMovieView) findViewById(R.id.gif_dis_topics);
        smoke = (GifMovieView) findViewById(R.id.gif_dis_smoke);

        topics.setMovieAsset(getString(R.string.gif_discovery_topics));
        smoke.setMovieAsset(getString(R.string.gif_discovery_smoke));

        homeSoundId = soundFactory.getSound(R.string.mp3_home_001, 1);
        hobbSoundId = soundFactory.getSound(R.string.mp3_hobby_001, 1);
        holSoundId = soundFactory.getSound(R.string.mp3_holiday_001, 1);
        citySoundId = soundFactory.getSound(R.string.mp3_city_001, 1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, home)) {
                toPage(Home.class);
                pool.play(homeSoundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, act)) {
                toPage(Hobbies.class);
                pool.play(hobbSoundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, hol)) {
                toPage(Holiday.class);
                pool.play(holSoundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, city)) {
                toPage(City.class);
                pool.play(citySoundId, 1, 1, 0, 0, 1);
            }
        }
        return super.onTouchEvent(event);
    }

//    @Override
//    public void toPage(final Class<?> cls) {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                toPage.setClass(Discovery.this, cls);
//                startActivity(toPage);
//            }
//        }, 0);
//    }


    @Override
    protected void onDestroy() {
        pool.unload(homeSoundId);
        pool.unload(hobbSoundId);
        pool.unload(holSoundId);
        pool.unload(citySoundId);
        super.onDestroy();
    }
}