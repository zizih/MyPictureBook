package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.Discovery;
import andr.lexibook.mypicturebook.one.ui.act.Mode;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 7/1/13.
 */
public class SubBase extends BaseActivity {

    private int[] dis_location;
    private int[] mode_location;
    private int commSoundId;

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
        if (checkLocation(event, dis_location))
            toPage(Discovery.class);
        if (checkLocation(event, mode_location))
            toPage(Mode.class);
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        finish();
    }
}
