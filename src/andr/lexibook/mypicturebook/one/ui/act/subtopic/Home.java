package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BathroomQ5;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BedroomQ9;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.GardenQ13;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.KitchenQ1;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;

/**
 * Created by rain on 6/23/13.
 */
public class Home extends SubBase implements MediaPlayer.OnCompletionListener {

    private GifMovieView bee;
    private GifMovieView butterfly;
    private GifMovieView dog;

    /**
     * kitchen :R.string.mp3_home_002, 1
     * bath :R.string.mp3_home_048, 1
     * bed: R.string.mp3_home_093
     * garden:  R.string.mp3_home_138
     */
    private MediaPlayer subMedia;
    private int subIndex = 0;
    private int[] kitchen_location;
    private int[] bedroom_location;
    private int[] bathroom_location;
    private int[] garden_location;

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

        kitchen_location = getResources().getIntArray(R.array.home_kitchen);
        bedroom_location = getResources().getIntArray(R.array.home_bedroom);
        bathroom_location = getResources().getIntArray(R.array.home_bathroom);
        garden_location = getResources().getIntArray(R.array.home_garden);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, kitchen_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_home_002);
                subIndex = 0;
            }
            if (checkLocation(event, bathroom_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_home_048);
                subIndex = 1;
            }
            if (checkLocation(event, bedroom_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_home_093);
                subIndex = 2;
            }
            if (checkLocation(event, garden_location)) {
                subMedia = mediaFactory.getMedia(R.string.mp3_home_138);
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
                toPage(KitchenQ1.class);
                break;
            case 1:
                toPage(BathroomQ5.class);
                break;
            case 2:
                toPage(BedroomQ9.class);
                break;
            case 3:
                toPage(GardenQ13.class);
                break;
        }
    }

    @Override
    public void toPage(Class<?> cls) {
        subMedia.release();
        super.toPage(cls);
    }

}
