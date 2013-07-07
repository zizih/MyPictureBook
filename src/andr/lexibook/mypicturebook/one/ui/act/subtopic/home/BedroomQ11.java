package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BedroomQ11 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q10_my_home_bedroom_02_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q10_my_home_bedroom_02_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q11));

        rightCount = 6;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_094);
        greenDrawables = new int[]{
                R.drawable.animr11_green_01
                , R.drawable.animr11_green_02
                , R.drawable.animr11_green_03
                , R.drawable.animr11_green_04
                , R.drawable.animr11_green_05
                , R.drawable.animr11_green_06
                , R.drawable.animr11_green_07
                , R.drawable.animr11_green_08
                , R.drawable.animr11_green_09
                , R.drawable.animr11_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr11_grey_01
                , R.drawable.animr11_grey_02
                , R.drawable.animr11_grey_03
                , R.drawable.animr11_grey_04
                , R.drawable.animr11_grey_05
                , R.drawable.animr11_red_06
                , R.drawable.animr11_grey_06
                , R.drawable.animr11_grey_07png
                , R.drawable.animr11_grey_08
                , R.drawable.animr11_grey_09
        };
        redDrawables = new int[]{
                R.drawable.animr11_red_01
                , R.drawable.animr11_red_02
                , R.drawable.animr11_red_03
                , R.drawable.animr11_red_04
                , R.drawable.animr11_red_05
                , R.drawable.animr11_red_06
                , R.drawable.animr11_red_07
                , R.drawable.animr11_red_08
                , R.drawable.animr11_red_09
                , R.drawable.animr11_red_10
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
                getResources().getIntArray(R.array.home_bedroom_q11_anim01)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim02)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim03)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim04)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim05)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim06)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim07)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim08)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim09)
                , getResources().getIntArray(R.array.home_bedroom_q11_anim10)
        };

        relocations = new int[]{6,5,8,9,7,1,4,2,3,10};
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
