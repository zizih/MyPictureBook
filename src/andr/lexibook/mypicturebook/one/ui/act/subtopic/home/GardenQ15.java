package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class GardenQ15 extends HomeBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_03_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_03_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q15));

        rightCount = 5;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_162);
        greenDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_03_posa_green
                , R.drawable.fr_q04_my_home_garden_03_posb_green
                , R.drawable.fr_q04_my_home_garden_03_posc_green
                , R.drawable.fr_q04_my_home_garden_03_posd_green
                , R.drawable.fr_q04_my_home_garden_03_pose_green
                , R.drawable.fr_q04_my_home_garden_03_posf_green
                , R.drawable.fr_q04_my_home_garden_03_posg_green
                , R.drawable.fr_q04_my_home_garden_03_posh_green
                , R.drawable.fr_q04_my_home_garden_03_posi_green
                , R.drawable.fr_q04_my_home_garden_03_posj_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_03_posa_grey
                , R.drawable.fr_q04_my_home_garden_03_posb_grey
                , R.drawable.fr_q04_my_home_garden_03_posc_grey
                , R.drawable.fr_q04_my_home_garden_03_posd_grey
                , R.drawable.fr_q04_my_home_garden_03_pose_grey
                , R.drawable.fr_q04_my_home_garden_03_posf_grey
                , R.drawable.fr_q04_my_home_garden_03_posg_grey
                , R.drawable.fr_q04_my_home_garden_03_posh_grey
                , R.drawable.fr_q04_my_home_garden_03_posi_grey
                , R.drawable.fr_q04_my_home_garden_03_posj_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_03_posa_red
                , R.drawable.fr_q04_my_home_garden_03_posb_red
                , R.drawable.fr_q04_my_home_garden_03_posc_red
                , R.drawable.fr_q04_my_home_garden_03_posd_red
                , R.drawable.fr_q04_my_home_garden_03_pose_red
                , R.drawable.fr_q04_my_home_garden_03_posf_red
                , R.drawable.fr_q04_my_home_garden_03_posg_red
                , R.drawable.fr_q04_my_home_garden_03_posh_red
                , R.drawable.fr_q04_my_home_garden_03_posi_red
                , R.drawable.fr_q04_my_home_garden_03_posj_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_163, 1)
                , soundFactory.getSound(R.string.mp3_home_164, 1)
                , soundFactory.getSound(R.string.mp3_home_165, 1)
                , soundFactory.getSound(R.string.mp3_home_166, 1)
                , soundFactory.getSound(R.string.mp3_home_167, 1)
                , soundFactory.getSound(R.string.mp3_home_168, 1)
                , soundFactory.getSound(R.string.mp3_home_169, 1)
                , soundFactory.getSound(R.string.mp3_home_170, 1)
                , soundFactory.getSound(R.string.mp3_home_171, 1)
                , soundFactory.getSound(R.string.mp3_home_172, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_garden_q15_anim01)
                , getResources().getIntArray(R.array.home_garden_q15_anim02)
                , getResources().getIntArray(R.array.home_garden_q15_anim03)
                , getResources().getIntArray(R.array.home_garden_q15_anim04)
                , getResources().getIntArray(R.array.home_garden_q15_anim05)
                , getResources().getIntArray(R.array.home_garden_q15_anim06)
                , getResources().getIntArray(R.array.home_garden_q15_anim07)
                , getResources().getIntArray(R.array.home_garden_q15_anim08)
                , getResources().getIntArray(R.array.home_garden_q15_anim09)
                , getResources().getIntArray(R.array.home_garden_q15_anim10)
        };

        relocations = new int[]{1, 4, 9, 5, 7, 6, 10, 3, 8, 2};
        greenDrawables = relocation(greenDrawables);
        grayDrawables = relocation(grayDrawables);
        redDrawables = relocation(redDrawables);
        locations = relocation(locations);
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(GardenQ16.class);
    }
}
