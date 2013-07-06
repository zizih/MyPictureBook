package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ3 extends HomeBase {

    private int q3Index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q01_my_home_kitchen_03a));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_03a_image_normal));

        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_025);
        greenDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_03_lorange_green
                , R.drawable.fr_my_home_kitchen_03_pomme_green
                , R.drawable.fr_my_home_kitchen_03_fraise_green
                , R.drawable.fr_my_home_kitchen_03_banane_green
                , R.drawable.fr_my_home_kitchen_03_poire_green
                , R.drawable.fr_my_home_kitchen_03_chou_green
                , R.drawable.fr_my_home_kitchen_03_poireau_green
                , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_green
                , R.drawable.fr_my_home_kitchen_03_carotte_green
                , R.drawable.fr_my_home_kitchen_03_concombre_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_03_lorange_grey
                , R.drawable.fr_my_home_kitchen_03_pomme_grey
                , R.drawable.fr_my_home_kitchen_03_fraise_grey
                , R.drawable.fr_my_home_kitchen_03_banane_grey
                , R.drawable.fr_my_home_kitchen_03_poire_grey
                , R.drawable.fr_my_home_kitchen_03_chou_grey
                , R.drawable.fr_my_home_kitchen_03_poireau_grey
                , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_grey
                , R.drawable.fr_my_home_kitchen_03_carotte_grey
                , R.drawable.fr_my_home_kitchen_03_concombre_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_03_lorange_red
                , R.drawable.fr_my_home_kitchen_03_pomme_red
                , R.drawable.fr_my_home_kitchen_03_fraise_red
                , R.drawable.fr_my_home_kitchen_03_banane_red
                , R.drawable.fr_my_home_kitchen_03_poire_red
                , R.drawable.fr_my_home_kitchen_03_chou_red
                , R.drawable.fr_my_home_kitchen_03_poireau_red
                , R.drawable.fr_my_home_kitchen_03_pomme_de_terre_red
                , R.drawable.fr_my_home_kitchen_03_carotte_red
                , R.drawable.fr_my_home_kitchen_03_concombre_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_026, 1)
                , soundFactory.getSound(R.string.mp3_home_027, 1)
                , soundFactory.getSound(R.string.mp3_home_028, 1)
                , soundFactory.getSound(R.string.mp3_home_029, 1)
                , soundFactory.getSound(R.string.mp3_home_030, 1)
                , soundFactory.getSound(R.string.mp3_home_032, 1)
                , soundFactory.getSound(R.string.mp3_home_033, 1)
                , soundFactory.getSound(R.string.mp3_home_034, 1)
                , soundFactory.getSound(R.string.mp3_home_035, 1)
                , soundFactory.getSound(R.string.mp3_home_036, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_kitchen_q3_lorange)
                , getResources().getIntArray(R.array.home_kitchen_q3_pomme)
                , getResources().getIntArray(R.array.home_kitchen_q3_fraise)
                , getResources().getIntArray(R.array.home_kitchen_q3_banane)
                , getResources().getIntArray(R.array.home_kitchen_q3_poire)
                , getResources().getIntArray(R.array.home_kitchen_q3_chou)
                , getResources().getIntArray(R.array.home_kitchen_q3_poireau)
                , getResources().getIntArray(R.array.home_kitchen_q3_pomme_de)
                , getResources().getIntArray(R.array.home_kitchen_q3_carotte)
                , getResources().getIntArray(R.array.home_kitchen_q3_concombre)
        };
    }

    private void toQ3B() {
        q3Index = 1;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_031);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q01_my_home_kitchen_03b));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_03b_image_normal));
        /**
         * remove bg of answer
         */
        for (int i = 0; i < 10; i++) {
            lls[i].setBackgroundDrawable(null);
            ifClicks[i] = false;
            ifGrays[i] = false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            for (int i = 0; i < rightCount; i++)
                if (checkLocation(event, locations[i])) {
                    pool.play(sounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        if (q3Index == 0)
                            lls[i].setBackgroundDrawable(getResources().getDrawable(greenDrawables[i]));
                        else if(q3Index ==1)
                            lls[i].setBackgroundDrawable(getResources().getDrawable(redDrawables[i]));
                        ifClicks[i] = true;
                    }
                }
            for (int i = rightCount; i < 10; i++)
                if (checkLocation(event, locations[i])) {
                    pool.play(sounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        if (q3Index == 0)
                            lls[i].setBackgroundDrawable(getResources().getDrawable(redDrawables[i]));
                        else if(q3Index ==1)
                            lls[i].setBackgroundDrawable(getResources().getDrawable(greenDrawables[i]));
                        ifClicks[i] = true;
                    }
                }
            mHandler.postDelayed(toGrayThead, 1000);
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toNext() {
        super.toNext();
        if (q3Index == 0)
            toQ3B();
        else if (q3Index == 1)
            toPage(KitchenQ4.class);
    }

    @Override
    public void toGray() {
        if (q3Index == 0) {
            for (int i = 0; i < rightCount; i++)
                if (ifClicks[i] && !ifGrays[i]) {
                    lls[i].setBackgroundDrawable(getResources().getDrawable(grayDrawables[i]));
                    ifGrays[i] = true;
                }
        } else if (q3Index == 1)
            for (int i = rightCount; i < 10; i++)
                if (ifClicks[i] && !ifGrays[i]) {
                    lls[i].setBackgroundDrawable(getResources().getDrawable(grayDrawables[i]));
                    ifGrays[i] = true;
                }
    }
}
