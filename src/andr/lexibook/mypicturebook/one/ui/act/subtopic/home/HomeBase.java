package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 7/3/13.
 */
public class HomeBase extends BaseActivity {

    private int[] home_location;
    public int[] next_location;
    public int[] media_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        home_location = getResources().getIntArray(R.array.home_kitchen_home);
        next_location = getResources().getIntArray(R.array.home_kitchen_next);
        media_location = getResources().getIntArray(R.array.home_kitchen_media);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
            if (checkLocation(event, home_location))
                toPage(Home.class);
        return super.onTouchEvent(event);
    }

}
