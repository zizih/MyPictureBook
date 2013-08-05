package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BathroomQ6;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class JobsQ29 extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.animr017__bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.animr017__image));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q05));

        rightCount = 4;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_city_003);
        greenDrawables = new int[]{
                R.drawable.animr018_green_01
                , R.drawable.animr018_green_02
                , R.drawable.animr018_green_03
                , R.drawable.animr018_green_04
                , R.drawable.animr018_green_05
                , R.drawable.animr018_green_06
                , R.drawable.animr018_green_07
                , R.drawable.animr018_green_08
                , R.drawable.animr018_green_09
                , R.drawable.animr018_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr017_grey_01
                , R.drawable.animr017_grey_02
                , R.drawable.animr017_grey_03
                , R.drawable.animr017_grey_04
                , R.drawable.animr017_grey_05
                , R.drawable.animr017_grey_06
                , R.drawable.animr017_grey_07
                , R.drawable.animr017_grey_08
                , R.drawable.animr017_grey_09
                , R.drawable.animr017_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr017_red_01
                , R.drawable.animr017_red_02
                , R.drawable.animr017_red_03
                , R.drawable.animr017_red_04
                , R.drawable.animr017_red_05
                , R.drawable.animr017_red_06
                , R.drawable.animr017_red_07
                , R.drawable.animr017_red_08
                , R.drawable.animr017_red_09
                , R.drawable.animr017_red_10
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_city_004, 1)
                , soundFactory.getSound(R.string.mp3_city_005, 1)
                , soundFactory.getSound(R.string.mp3_city_006, 1)
                , soundFactory.getSound(R.string.mp3_city_007, 1)
                , soundFactory.getSound(R.string.mp3_city_008, 1)
                , soundFactory.getSound(R.string.mp3_city_009, 1)
                , soundFactory.getSound(R.string.mp3_city_010, 1)
                , soundFactory.getSound(R.string.mp3_city_011, 1)
                , soundFactory.getSound(R.string.mp3_city_012, 1)
                , soundFactory.getSound(R.string.mp3_city_013, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.city_transportation_q17_anim01)
                , getResources().getIntArray(R.array.city_transportation_q17_anim02)
                , getResources().getIntArray(R.array.city_transportation_q17_anim03)
                , getResources().getIntArray(R.array.city_transportation_q17_anim04)
                , getResources().getIntArray(R.array.city_transportation_q17_anim05)
                , getResources().getIntArray(R.array.city_transportation_q17_anim06)
                , getResources().getIntArray(R.array.city_transportation_q17_anim07)
                , getResources().getIntArray(R.array.city_transportation_q17_anim08)
                , getResources().getIntArray(R.array.city_transportation_q17_anim09)
                , getResources().getIntArray(R.array.city_transportation_q17_anim10)
        };
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(BathroomQ6.class);
    }
}
