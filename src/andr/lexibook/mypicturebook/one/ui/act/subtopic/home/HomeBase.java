package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;

/**
 * Created by rain on 7/3/13.
 */
@SuppressWarnings("deprecation")
public class HomeBase extends BaseActivity {

    public int[] home_location;
    public int[] next_location;
    public int[] media_location;

    public Handler mHandler;
    public ToGrayThread toGrayThead;
    public AbsoluteLayout al_bg;
    public LinearLayout ll_fg;

    public LinearLayout[] lls;
    public int[] sounds;
    public int[][] locations;
    public boolean[] ifClicks = {false, false, false, false, false, false, false, false, false, false};
    public boolean[] ifGrays = {false, false, false, false, false, false, false, false, false, false};

    public int[] greenDrawables;
    public int[] grayDrawables;
    public int[] redDrawables;

    public int q_soundId;
    public int rightCount = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        al_bg = (AbsoluteLayout) findViewById(R.id.al_subtopic_layout);
        ll_fg = (LinearLayout) findViewById(R.id.ll_subtopic_fore);

        home_location = getResources().getIntArray(R.array.home_kitchen_home);
        next_location = getResources().getIntArray(R.array.home_kitchen_next);
        media_location = getResources().getIntArray(R.array.home_kitchen_media);
        mHandler = new Handler();
        toGrayThead = new ToGrayThread();
        lls = new LinearLayout[]{
                (LinearLayout) findViewById(R.id.ll_subtopic_a01),
                (LinearLayout) findViewById(R.id.ll_subtopic_a02),
                (LinearLayout) findViewById(R.id.ll_subtopic_a03),
                (LinearLayout) findViewById(R.id.ll_subtopic_a04),
                (LinearLayout) findViewById(R.id.ll_subtopic_a05),
                (LinearLayout) findViewById(R.id.ll_subtopic_a06),
                (LinearLayout) findViewById(R.id.ll_subtopic_a07),
                (LinearLayout) findViewById(R.id.ll_subtopic_a08),
                (LinearLayout) findViewById(R.id.ll_subtopic_a09),
                (LinearLayout) findViewById(R.id.ll_subtopic_a10)
        };
    }

    class ToGrayThread implements Runnable {

        @Override
        public void run() {
            (HomeBase.this).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    toGray();
                }
            });
        }
    }

    public void toGray() {
        //specify by sub-class
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, home_location))
                toPage(Home.class);
            if (checkLocation(event, media_location)) {
                priorityPool.play(q_soundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, next_location)) {
                System.out.println("toNext...");
                toNext();
            }
            for (int i = 0; i < rightCount; i++)
                if (checkLocation(event, locations[i])) {
                    pool.play(sounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        lls[i].setBackgroundDrawable(getResources().getDrawable(greenDrawables[i]));
                        ifClicks[i] = true;
                    }
                }
            for (int i = rightCount; i < 10; i++)
                if (checkLocation(event, locations[i])) {
                    pool.play(sounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        lls[i].setBackgroundDrawable(getResources().getDrawable(redDrawables[i]));
                        ifClicks[i] = true;
                    }
                }
            mHandler.postDelayed(toGrayThead, 1000);
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        for (int i = 0; i < 10; i++)
            pool.unload(sounds[i]);
        priorityPool.unload(q_soundId);
        super.toPage(cls);
    }

    public void toNext() {
    }
}
