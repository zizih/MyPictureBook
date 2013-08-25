package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.Discovery;
import andr.lexibook.mypicturebook.one.ui.act.Mode;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 7/1/13.
 */
public class TopicBase extends BaseActivity implements MediaPlayer.OnCompletionListener {

    private int[] dis_location;
    private int[] mode_location;
    private int commSoundId;
    private MediaPlayer subMedia;
    private int subIndex;
    public int[][] sub_locations;
    public int[] sub_medias;
    public Class[] sub_clzz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dis_location = getResources().getIntArray(R.array.sub_toDis);
        mode_location = getResources().getIntArray(R.array.sub_toMode);

        commSoundId = soundFactory.getSound(R.string.mp3_main_006, 1);
        pool.play(commSoundId, 1, 1, 0, 0, 1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, dis_location))
                toPage(Discovery.class);
            if (checkLocation(event, mode_location))
                toPage(Mode.class);
            if (sub_locations != null && (sub_locations.length == sub_medias.length)) {
                for (int i = 0; i < sub_locations.length; i++) {
                    if (checkLocation(event, sub_locations[i])) {
                        subMedia = mediaFactory.getMedia(sub_medias[i]);
                        subIndex = i;
                    }
                }
                play(subMedia);
                subMedia.setOnCompletionListener(this);
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        finish();
    }


    @Override
    public void onCompletion(MediaPlayer mp) {
        mp.release();
        if (sub_clzz[subIndex] != null) {
            toPage(sub_clzz[subIndex]);
        }
    }
}
