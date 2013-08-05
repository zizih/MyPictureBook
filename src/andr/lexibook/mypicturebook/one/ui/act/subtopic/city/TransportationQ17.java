package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.BathroomQ6;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.HomeBase;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class TransportationQ17 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q05_my_home_bathroom_01_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q05_my_home_bathroom_01_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q05));

        rightCount = 4;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_049);
        greenDrawables = new int[]{
                R.drawable.fr_q05_my_home_bathroom_01_posi_green
                , R.drawable.fr_q05_my_home_bathroom_01_posd_green
                , R.drawable.fr_q05_my_home_bathroom_01_posj_green
                , R.drawable.fr_q05_my_home_bathroom_01_posh_green
                , R.drawable.fr_q05_my_home_bathroom_01_posc_green
                , R.drawable.fr_q05_my_home_bathroom_01_posa_green
                , R.drawable.fr_q05_my_home_bathroom_01_posg_green
                , R.drawable.fr_q05_my_home_bathroom_01_posf_green
                , R.drawable.fr_q05_my_home_bathroom_01_posb_green
                , R.drawable.fr_q05_my_home_bathroom_01_pose_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_q05_my_home_bathroom_01_posi_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posd_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posj_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posh_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posc_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posa_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posg_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posf_grey
                , R.drawable.fr_q05_my_home_bathroom_01_posb_grey
                , R.drawable.fr_q05_my_home_bathroom_01_pose_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_q05_my_home_bathroom_01_posi_red
                , R.drawable.fr_q05_my_home_bathroom_01_posd_red
                , R.drawable.fr_q05_my_home_bathroom_01_posj_red
                , R.drawable.fr_q05_my_home_bathroom_01_posh_red
                , R.drawable.fr_q05_my_home_bathroom_01_posc_red
                , R.drawable.fr_q05_my_home_bathroom_01_posa_red
                , R.drawable.fr_q05_my_home_bathroom_01_posg_red
                , R.drawable.fr_q05_my_home_bathroom_01_posf_red
                , R.drawable.fr_q05_my_home_bathroom_01_posb_red
                , R.drawable.fr_q05_my_home_bathroom_01_pose_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_050, 1)
                , soundFactory.getSound(R.string.mp3_home_051, 1)
                , soundFactory.getSound(R.string.mp3_home_052, 1)
                , soundFactory.getSound(R.string.mp3_home_053, 1)
                , soundFactory.getSound(R.string.mp3_home_054, 1)
                , soundFactory.getSound(R.string.mp3_home_055, 1)
                , soundFactory.getSound(R.string.mp3_home_056, 1)
                , soundFactory.getSound(R.string.mp3_home_057, 1)
                , soundFactory.getSound(R.string.mp3_home_058, 1)
                , soundFactory.getSound(R.string.mp3_home_059, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_bathroom_q5_pistolet)
                , getResources().getIntArray(R.array.home_bathroom_q5_aquatique)
                , getResources().getIntArray(R.array.home_bathroom_q5_canard)
                , getResources().getIntArray(R.array.home_bathroom_q5_pingouin)
                , getResources().getIntArray(R.array.home_bathroom_q5_cereales)
                , getResources().getIntArray(R.array.home_bathroom_q5_laisse)
                , getResources().getIntArray(R.array.home_bathroom_q5_mixuer)
                , getResources().getIntArray(R.array.home_bathroom_q5_brique)
                , getResources().getIntArray(R.array.home_bathroom_q5_bois)
                , getResources().getIntArray(R.array.home_bathroom_q5_laque)
        };
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(BathroomQ6.class);
    }
}
