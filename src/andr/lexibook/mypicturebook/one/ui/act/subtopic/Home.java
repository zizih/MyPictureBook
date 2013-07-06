package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.Bedroom;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.KitchenQ1;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 6/23/13.
 */
public class Home extends SubBase {

    private GifMovieView bee;
    private GifMovieView butterfly;
    private GifMovieView dog;

    private int kitchenSoundId;
    private int bathroomSoundId;
    private int[] kitchen_location;
    private int[] bedroom_location;

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

        kitchenSoundId = soundFactory.getSound(R.string.mp3_home_002, 1);
        bathroomSoundId = soundFactory.getSound(R.string.mp3_home_093, 1);

        kitchen_location = getResources().getIntArray(R.array.home_kitchen);
        bedroom_location = getResources().getIntArray(R.array.home_bedroom);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, kitchen_location))
                toPage(KitchenQ1.class);
            if (checkLocation(event, bedroom_location))
                toPage(Bedroom.class);
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        pool.unload(kitchenSoundId);
        pool.unload(bathroomSoundId);
        super.toPage(cls);
    }
}
