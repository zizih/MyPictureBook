package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BedroomQ10 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q10_my_home_bedroom_02_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q10_my_home_bedroom_02_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q10));

        rightCount = 3;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_094);
        greenDrawables = new int[]{
                R.drawable.animr10_green_01
                , R.drawable.animr10_green_02
                , R.drawable.animr10_green_03
                , R.drawable.animr10_green_04
                , R.drawable.animr10_green_05
                , R.drawable.animr10_green_06
                , R.drawable.animr10_green_07
                , R.drawable.animr10_green_08
                , R.drawable.animr10_green_09
                , R.drawable.animr10_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr10_grey_01
                , R.drawable.animr10_grey_02
                , R.drawable.animr10_grey_03
                , R.drawable.animr10_grey_04
                , R.drawable.animr10_grey_05
                , R.drawable.animr10_grey_06
                , R.drawable.animr10_grey_07
                , R.drawable.animr10_grey_08
                , R.drawable.animr10_grey_09
                , R.drawable.animr10_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr10_red_01
                , R.drawable.animr10_red_02
                , R.drawable.animr10_red_03
                , R.drawable.animr10_red_04
                , R.drawable.animr10_red_05
                , R.drawable.animr10_red_06
                , R.drawable.animr10_red_07
                , R.drawable.animr10_red_08
                , R.drawable.animr10_red_09
                , R.drawable.animr10_red_10
        };
        sounds = new int[]{
                 soundFactory.getSound(R.string.mp3_home_106, 1)
                , soundFactory.getSound(R.string.mp3_home_107, 1)
                , soundFactory.getSound(R.string.mp3_home_108, 1)
                , soundFactory.getSound(R.string.mp3_home_109, 1)
                , soundFactory.getSound(R.string.mp3_home_110, 1)
                , soundFactory.getSound(R.string.mp3_home_111, 1)
                , soundFactory.getSound(R.string.mp3_home_112, 1)
                , soundFactory.getSound(R.string.mp3_home_113, 1)
                , soundFactory.getSound(R.string.mp3_home_114, 1)
                , soundFactory.getSound(R.string.mp3_home_115, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bedroom_q10_anim01)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim02)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim03)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim04)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim05)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim06)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim07)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim08)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim09)
                , getResources().getIntArray(R.array.home_bedroom_q10_anim10)
        };

        relocations = new int[]{6,1,3,5,2,10,9,8,4,7};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(BedroomQ11.class);
    }
}
