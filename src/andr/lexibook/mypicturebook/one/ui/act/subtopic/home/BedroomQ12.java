package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BedroomQ12 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q12_my_home_bedroom_04_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q12_my_home_bedroom_04_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q12));

        rightCount = 3;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_127);
        greenDrawables = new int[]{
                R.drawable.animr12_green_01
                , R.drawable.animr12_green_02
                , R.drawable.animr12_green_03
                , R.drawable.animr12_green_04
                , R.drawable.animr12_green_05
                , R.drawable.animr12_green_06
                , R.drawable.animr12_green_07
                , R.drawable.animr12_green_08
                , R.drawable.animr12_green_09
                , R.drawable.animr12_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr12_grey_01
                , R.drawable.animr12_grey_02
                , R.drawable.animr12_grey_03
                , R.drawable.animr12_grey_04
                , R.drawable.animr12_grey_05
                , R.drawable.animr12_grey_06
                , R.drawable.animr12_grey_07
                , R.drawable.animr12_grey_08
                , R.drawable.animr12_grey_09
                , R.drawable.animr12_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr12_red_01
                , R.drawable.animr12_red_02
                , R.drawable.animr12_red_03
                , R.drawable.animr12_red_04
                , R.drawable.animr12_red_05
                , R.drawable.animr12_red_06
                , R.drawable.animr12_red_07
                , R.drawable.animr12_red_08
                , R.drawable.animr12_red_09
                , R.drawable.animr12_red_10
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_128, 1)
                , soundFactory.getSound(R.string.mp3_home_129, 1)
                , soundFactory.getSound(R.string.mp3_home_130, 1)
                , soundFactory.getSound(R.string.mp3_home_131, 1)
                , soundFactory.getSound(R.string.mp3_home_132, 1)
                , soundFactory.getSound(R.string.mp3_home_133, 1)
                , soundFactory.getSound(R.string.mp3_home_134, 1)
                , soundFactory.getSound(R.string.mp3_home_135, 1)
                , soundFactory.getSound(R.string.mp3_home_136, 1)
                , soundFactory.getSound(R.string.mp3_home_137, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bedroom_q12_anim01)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim02)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim03)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim04)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim05)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim06)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim07)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim08)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim09)
                , getResources().getIntArray(R.array.home_bedroom_q12_anim10)
        };

        relocations = new int[]{9, 4, 5, 3, 1, 8, 2, 7, 6, 10};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        finish();
    }
}
