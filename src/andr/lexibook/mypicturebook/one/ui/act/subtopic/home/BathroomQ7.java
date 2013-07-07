package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BathroomQ7 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q07_my_home_bathroom_03_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q07_my_home_bathroom_03_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q07));

        rightCount = 3;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_071);
        greenDrawables = new int[]{
                R.drawable.animr07_green_01
                , R.drawable.animr07_green_02
                , R.drawable.animr07_green_03
                , R.drawable.animr07_green_04
                , R.drawable.animr07_green_05
                , R.drawable.animr07_green_06
                , R.drawable.animr07_green_07
                , R.drawable.animr07_green_08
                , R.drawable.animr07_green_09
                , R.drawable.animr07_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr07_grey_01
                , R.drawable.animr07_grey_02
                , R.drawable.animr07_grey_03
                , R.drawable.animr07_grey_04
                , R.drawable.animr07_grey_05
                , R.drawable.animr07_grey_06
                , R.drawable.animr07_grey_07
                , R.drawable.animr07_grey_08
                , R.drawable.animr07_grey_09
                , R.drawable.animr07_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr07_red_01
                , R.drawable.animr07_red_02
                , R.drawable.animr07_red_03
                , R.drawable.animr07_red_04
                , R.drawable.animr07_red_05
                , R.drawable.animr07_red_06
                , R.drawable.animr07_red_07
                , R.drawable.animr07_red_08
                , R.drawable.animr07_red_09
                , R.drawable.animr07_red_10
        };
        sounds = new int[]{
                 soundFactory.getSound(R.string.mp3_home_072, 1)
                , soundFactory.getSound(R.string.mp3_home_073, 1)
                , soundFactory.getSound(R.string.mp3_home_074, 1)
                , soundFactory.getSound(R.string.mp3_home_075, 1)
                , soundFactory.getSound(R.string.mp3_home_076, 1)
                , soundFactory.getSound(R.string.mp3_home_077, 1)
                , soundFactory.getSound(R.string.mp3_home_078, 1)
                , soundFactory.getSound(R.string.mp3_home_079, 1)
                , soundFactory.getSound(R.string.mp3_home_080, 1)
                , soundFactory.getSound(R.string.mp3_home_081, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bathroom_q7_anim01)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim02)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim03)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim04)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim05)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim06)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim07)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim08)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim09)
                , getResources().getIntArray(R.array.home_bathroom_q7_anim10)
        };

        relocations = new int[]{1,9,7,3,6,10,2,4,8};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(BathroomQ8.class);
    }
}
