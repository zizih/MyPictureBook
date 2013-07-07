package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BedroomQ9 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q09_my_home_bedroom_01_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q09_my_home_bedroom_01_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q08));

        rightCount = 4;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_094);
        greenDrawables = new int[]{
                R.drawable.animr09_green_01
                , R.drawable.animr09_green_02
                , R.drawable.animr09_green_03
                , R.drawable.animr09_green_04
                , R.drawable.animr09_green_05
                , R.drawable.animr09_green_06
                , R.drawable.animr09_green_07
                , R.drawable.animr09_green_08
                , R.drawable.animr09_green_09
                , R.drawable.animr09_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr09_grey_01
                , R.drawable.animr09_grey_02
                , R.drawable.animr09_grey_03
                , R.drawable.animr09_grey_04
                , R.drawable.animr09_grey_05
                , R.drawable.animr09_grey_06
                , R.drawable.animr09_grey_07
                , R.drawable.animr09_grey_08
                , R.drawable.animr09_grey_09
                , R.drawable.animr09_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr09_red_01
                , R.drawable.animr09_red_02
                , R.drawable.animr09_red_03
                , R.drawable.animr09_red_04
                , R.drawable.animr09_red_05
                , R.drawable.animr09_red_06
                , R.drawable.animr09_red_07
                , R.drawable.animr09_red_08
                , R.drawable.animr09_red_09
                , R.drawable.animr09_red_10
        };
        sounds = new int[]{
                 soundFactory.getSound(R.string.mp3_home_095, 1)
                , soundFactory.getSound(R.string.mp3_home_096, 1)
                , soundFactory.getSound(R.string.mp3_home_097, 1)
                , soundFactory.getSound(R.string.mp3_home_098, 1)
                , soundFactory.getSound(R.string.mp3_home_099, 1)
                , soundFactory.getSound(R.string.mp3_home_100, 1)
                , soundFactory.getSound(R.string.mp3_home_101, 1)
                , soundFactory.getSound(R.string.mp3_home_102, 1)
                , soundFactory.getSound(R.string.mp3_home_103, 1)
                , soundFactory.getSound(R.string.mp3_home_104, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bedroom_q9_anim01)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim02)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim03)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim04)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim05)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim06)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim07)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim08)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim09)
                , getResources().getIntArray(R.array.home_bedroom_q9_anim10)
        };

        relocations = new int[]{1,8,2,7,6,3,4,9,10,5};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(BedroomQ10.class);
    }
}
