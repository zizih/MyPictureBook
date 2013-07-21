package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class GardenQ14 extends HomeBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_01_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q04_my_home_garden_01_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q13));

        rightCount = 6;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_139);
        greenDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_01_posa_green
                , R.drawable.fr_q04_my_home_garden_01_posb_green
                , R.drawable.fr_q04_my_home_garden_01_posc_green
                , R.drawable.fr_q04_my_home_garden_01_posd_green
                , R.drawable.fr_q04_my_home_garden_01_pose_green
                , R.drawable.fr_q04_my_home_garden_01_posf_green
                , R.drawable.fr_q04_my_home_garden_01_posg_green
                , R.drawable.fr_q04_my_home_garden_01_posh_green
                , R.drawable.fr_q04_my_home_garden_01_posi_green
                , R.drawable.fr_q04_my_home_garden_01_posj_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_01_posa_grey
                , R.drawable.fr_q04_my_home_garden_01_posb_grey
                , R.drawable.fr_q04_my_home_garden_01_posc_grey
                , R.drawable.fr_q04_my_home_garden_01_posd_grey
                , R.drawable.fr_q04_my_home_garden_01_pose_grey
                , R.drawable.fr_q04_my_home_garden_01_posf_grey
                , R.drawable.fr_q04_my_home_garden_01_posg_grey
                , R.drawable.fr_q04_my_home_garden_01_posh_grey
                , R.drawable.fr_q04_my_home_garden_01_posi_grey
                , R.drawable.fr_q04_my_home_garden_01_posj_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_q04_my_home_garden_01_posa_red
                , R.drawable.fr_q04_my_home_garden_01_posb_red
                , R.drawable.fr_q04_my_home_garden_01_posc_red
                , R.drawable.fr_q04_my_home_garden_01_posd_red
                , R.drawable.fr_q04_my_home_garden_01_pose_red
                , R.drawable.fr_q04_my_home_garden_01_posf_red
                , R.drawable.fr_q04_my_home_garden_01_posg_red
                , R.drawable.fr_q04_my_home_garden_01_posh_red
                , R.drawable.fr_q04_my_home_garden_01_posi_red
                , R.drawable.fr_q04_my_home_garden_01_posj_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_140, 1)
                , soundFactory.getSound(R.string.mp3_home_141, 1)
                , soundFactory.getSound(R.string.mp3_home_142, 1)
                , soundFactory.getSound(R.string.mp3_home_143, 1)
                , soundFactory.getSound(R.string.mp3_home_144, 1)
                , soundFactory.getSound(R.string.mp3_home_145, 1)
                , soundFactory.getSound(R.string.mp3_home_146, 1)
                , soundFactory.getSound(R.string.mp3_home_147, 1)
                , soundFactory.getSound(R.string.mp3_home_148, 1)
                , soundFactory.getSound(R.string.mp3_home_149, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_garden_q13_anim01)
                , getResources().getIntArray(R.array.home_garden_q13_anim02)
                , getResources().getIntArray(R.array.home_garden_q13_anim03)
                , getResources().getIntArray(R.array.home_garden_q13_anim04)
                , getResources().getIntArray(R.array.home_garden_q13_anim05)
                , getResources().getIntArray(R.array.home_garden_q13_anim06)
                , getResources().getIntArray(R.array.home_garden_q13_anim07)
                , getResources().getIntArray(R.array.home_garden_q13_anim08)
                , getResources().getIntArray(R.array.home_garden_q13_anim09)
                , getResources().getIntArray(R.array.home_garden_q13_anim10)
        };

        relocations = new int[]{5,3,7,6,8,4,2,9,10,1};
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
