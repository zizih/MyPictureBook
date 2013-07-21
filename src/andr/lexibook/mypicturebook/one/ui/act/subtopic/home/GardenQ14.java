package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by rain on 7/3/13.
 */
public class GardenQ14 extends HomeBase {

    private int q3Index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_02_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_02_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q14));

        rightCount = 4;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_150);
        greenDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_02_posa_green
                , R.drawable.fr_q04_my_home_garden_02_posb_green
                , R.drawable.fr_q04_my_home_garden_02_posc_green
                , R.drawable.fr_q04_my_home_garden_02_posd_green
                , R.drawable.fr_q04_my_home_garden_02_pose_green
                , R.drawable.fr_q04_my_home_garden_02_posf_green
                , R.drawable.fr_q04_my_home_garden_02_posg_green
                , R.drawable.fr_q04_my_home_garden_02_posh_green
                , R.drawable.fr_q04_my_home_garden_02_posi_green
                , R.drawable.fr_q04_my_home_garden_02_posj_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_02_posa_grey
                , R.drawable.fr_q04_my_home_garden_02_posb_grey
                , R.drawable.fr_q04_my_home_garden_02_posc_grey
                , R.drawable.fr_q04_my_home_garden_02_posd_grey
                , R.drawable.fr_q04_my_home_garden_02_pose_grey
                , R.drawable.fr_q04_my_home_garden_02_posf_grey
                , R.drawable.fr_q04_my_home_garden_02_posg_grey
                , R.drawable.fr_q04_my_home_garden_02_posh_grey
                , R.drawable.fr_q04_my_home_garden_02_posi_grey
                , R.drawable.fr_q04_my_home_garden_02_posj_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_02_posa_red
                , R.drawable.fr_q04_my_home_garden_02_posb_red
                , R.drawable.fr_q04_my_home_garden_02_posc_red
                , R.drawable.fr_q04_my_home_garden_02_posd_red
                , R.drawable.fr_q04_my_home_garden_02_pose_red
                , R.drawable.fr_q04_my_home_garden_02_posf_red
                , R.drawable.fr_q04_my_home_garden_02_posg_red
                , R.drawable.fr_q04_my_home_garden_02_posh_red
                , R.drawable.fr_q04_my_home_garden_02_posi_red
                , R.drawable.fr_q04_my_home_garden_02_posj_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_151, 1)
                , soundFactory.getSound(R.string.mp3_home_152, 1)
                , soundFactory.getSound(R.string.mp3_home_153, 1)
                , soundFactory.getSound(R.string.mp3_home_154, 1)
                , soundFactory.getSound(R.string.mp3_home_156, 1)
                , soundFactory.getSound(R.string.mp3_home_157, 1)
                , soundFactory.getSound(R.string.mp3_home_158, 1)
                , soundFactory.getSound(R.string.mp3_home_159, 1)
                , soundFactory.getSound(R.string.mp3_home_160, 1)
                , soundFactory.getSound(R.string.mp3_home_161, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_garden_q14_anim01)
                , getResources().getIntArray(R.array.home_garden_q14_anim02)
                , getResources().getIntArray(R.array.home_garden_q14_anim03)
                , getResources().getIntArray(R.array.home_garden_q14_anim04)
                , getResources().getIntArray(R.array.home_garden_q14_anim05)
                , getResources().getIntArray(R.array.home_garden_q14_anim06)
                , getResources().getIntArray(R.array.home_garden_q14_anim07)
                , getResources().getIntArray(R.array.home_garden_q14_anim08)
                , getResources().getIntArray(R.array.home_garden_q14_anim09)
                , getResources().getIntArray(R.array.home_garden_q14_anim10)
        };

        relocations = new int[]{10, 7, 4, 6, 1, 2, 5, 8, 3, 9};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    private void toQ14B() {
        q3Index = 1;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_155);
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
                        else if (q3Index == 1)
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
                        else if (q3Index == 1)
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
            toQ14B();
        else if (q3Index == 1)
            toPage(GardenQ15.class);
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
