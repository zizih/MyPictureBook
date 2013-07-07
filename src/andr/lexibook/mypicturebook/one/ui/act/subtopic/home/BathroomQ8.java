package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BathroomQ8 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q08_my_home_bathroom_04_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q08_my_home_bathroom_04_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q08));

        rightCount = 3;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_082);
        greenDrawables = new int[]{
                R.drawable.animr08_green_01
                , R.drawable.animr08_green_02
                , R.drawable.animr08_green_03
                , R.drawable.animr08_green_04
                , R.drawable.animr08_green_05
                , R.drawable.animr08_green_06
                , R.drawable.animr08_green_07
                , R.drawable.animr08_green_08
                , R.drawable.animr08_green_09
                , R.drawable.animr08_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr08_grey_01
                , R.drawable.animr08_grey_02
                , R.drawable.animr08_grey_03
                , R.drawable.animr08_grey_04
                , R.drawable.animr08_grey_05
                , R.drawable.animr08_grey_06
                , R.drawable.animr08_grey_07
                , R.drawable.animr08_grey_08
                , R.drawable.animr08_grey_09
                , R.drawable.animr08_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr08_red_01
                , R.drawable.animr08_red_02
                , R.drawable.animr08_red_03
                , R.drawable.animr08_red_04
                , R.drawable.animr08_red_05
                , R.drawable.animr08_red_06
                , R.drawable.animr08_red_07
                , R.drawable.animr08_red_08
                , R.drawable.animr08_red_09
                , R.drawable.animr08_red_10
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_083, 1)
                , soundFactory.getSound(R.string.mp3_home_084, 1)
                , soundFactory.getSound(R.string.mp3_home_085, 1)
                , soundFactory.getSound(R.string.mp3_home_086, 1)
                , soundFactory.getSound(R.string.mp3_home_087, 1)
                , soundFactory.getSound(R.string.mp3_home_088, 1)
                , soundFactory.getSound(R.string.mp3_home_089, 1)
                , soundFactory.getSound(R.string.mp3_home_090, 1)
                , soundFactory.getSound(R.string.mp3_home_091, 1)
                , soundFactory.getSound(R.string.mp3_home_092, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bathroom_q8_anim01)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim02)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim03)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim04)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim05)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim06)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim07)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim08)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim09)
                , getResources().getIntArray(R.array.home_bathroom_q8_anim10)
        };

        relocations = new int[]{1,5,3,8,9,4,2,7,6,10};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(Home.class);
    }
}
