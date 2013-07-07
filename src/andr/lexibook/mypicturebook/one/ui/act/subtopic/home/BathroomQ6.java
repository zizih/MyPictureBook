package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BathroomQ6 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q06_my_home_bathroom_02_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q06_my_home_bathroom_02_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q06));

        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_060);
        greenDrawables = new int[]{
                R.drawable.animr06_green_01
                , R.drawable.animr06_green_02
                , R.drawable.animr06_green_03
                , R.drawable.animr06_green_04
                , R.drawable.animr06_green_05
                , R.drawable.animr06_green_06
                , R.drawable.animr06_green_07
                , R.drawable.animr06_green_08
                , R.drawable.animr06_green_09
                , R.drawable.animr06_green_10
        };
        grayDrawables = new int[]{
                R.drawable.animr06_grey_01
                , R.drawable.animr06_grey_02
                , R.drawable.animr06_grey_03
                , R.drawable.animr06_grey_04
                , R.drawable.animr06_grey_05
                , R.drawable.animr06_grey_06
                , R.drawable.animr06_grey_07
                , R.drawable.animr06_grey_08
                , R.drawable.animr06_grey_09
                , R.drawable.animr06_grey_10
        };
        redDrawables = new int[]{
                R.drawable.animr06_red_01
                , R.drawable.animr06_red_02
                , R.drawable.animr06_red_03
                , R.drawable.animr06_red_04
                , R.drawable.animr06_red_05
                , R.drawable.animr06_red_06
                , R.drawable.animr06_red_07
                , R.drawable.animr06_red_08
                , R.drawable.animr06_red_09
                , R.drawable.animr06_red_10
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_061, 1)
                , soundFactory.getSound(R.string.mp3_home_062, 1)
                , soundFactory.getSound(R.string.mp3_home_063, 1)
                , soundFactory.getSound(R.string.mp3_home_064, 1)
                , soundFactory.getSound(R.string.mp3_home_065, 1)
                , soundFactory.getSound(R.string.mp3_home_066, 1)
                , soundFactory.getSound(R.string.mp3_home_067, 1)
                , soundFactory.getSound(R.string.mp3_home_068, 1)
                , soundFactory.getSound(R.string.mp3_home_069, 1)
                , soundFactory.getSound(R.string.mp3_home_070, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bedroom_q6_anim01)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim02)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim03)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim04)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim05)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim06)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim07)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim08)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim09)
                , getResources().getIntArray(R.array.home_bedroom_q6_anim10)
        };

        relocations = new int[]{7, 6, 9, 1, 4, 3, 10, 2, 5, 8};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
    }

    @Override
    public void toNext() {
        super.toNext();
//        toPage(BedroomQ6.class);
    }
}
