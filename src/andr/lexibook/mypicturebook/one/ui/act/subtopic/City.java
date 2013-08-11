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


    private MediaPlayer subMedia;
    private int subIndex = 0;
    private int[] school_location;
    private int[] jobs_location;
    private int[] shops_location;
    private int[] transportation_location;

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


        school_location = getResources().getIntArray(R.array.city_school_location);
        jobs_location = getResources().getIntArray(R.array.city_jobs_location);
        shops_location = getResources().getIntArray(R.array.city_shops_location);
        transportation_location = getResources().getIntArray(R.array.city_transportation_location);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, school_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_city_092);
                subIndex = 0;
            }
            if (checkLocation(event, jobs_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_city_137);
                subIndex = 1;
            }
            if (checkLocation(event, shops_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_city_047);
                subIndex = 2;
            }
            if (checkLocation(event, transportation_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_city_002);
                subIndex = 3;
            }
            play(subMedia);
            subMedia.setOnCompletionListener(this);
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        switch (subIndex) {
            case 0:
                toPage(TransportationQ17.class);
                break;
            case 1:
                toPage(ShopsQ21.class);
                break;
            case 2:
                toPage(SchoolQ25.class);
                break;
            case 3:
                toPage(JobsQ29.class);
                break;
        }
    }

    @Override
    public void toPage(Class<?> cls) {
        subMedia.release();
        super.toPage(cls);
    }

}
