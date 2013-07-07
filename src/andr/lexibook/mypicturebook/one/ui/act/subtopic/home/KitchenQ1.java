package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ1 extends HomeBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q01_my_home_kitchen_01_bkg));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q01_my_home_kitchen_01_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q01));

        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_003);
        greenDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_01_cravate_green
                , R.drawable.fr_my_home_kitchen_01_lepingle_green
                , R.drawable.fr_my_home_kitchen_01_chausse_pied_green
                , R.drawable.fr_my_home_kitchen_01_bijou_green
                , R.drawable.fr_my_home_kitchen_01_maquillage_green
                , R.drawable.fr_my_home_kitchen_01_fouet_green
                , R.drawable.fr_my_home_kitchen_01_cocotte_minute_green
                , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_green
                , R.drawable.fr_my_home_kitchen_01_lecumoire_green
                , R.drawable.fr_my_home_kitchen_01_passoire_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_01_cravate_grey
                , R.drawable.fr_my_home_kitchen_01_lepingle_grey
                , R.drawable.fr_my_home_kitchen_01_chausse_pied_grey
                , R.drawable.fr_my_home_kitchen_01_bijou_grey
                , R.drawable.fr_my_home_kitchen_01_maquillage_grey
                , R.drawable.fr_my_home_kitchen_01_fouet_grey
                , R.drawable.fr_my_home_kitchen_01_cocotte_minute_grey1
                , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_grey
                , R.drawable.fr_my_home_kitchen_01_lecumoire_grey
                , R.drawable.fr_my_home_kitchen_01_passoire_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_01_cravate_red
                , R.drawable.fr_my_home_kitchen_01_lepingle_red
                , R.drawable.fr_my_home_kitchen_01_chausse_pied_red
                , R.drawable.fr_my_home_kitchen_01_bijou_red
                , R.drawable.fr_my_home_kitchen_01_maquillage_red
                , R.drawable.fr_my_home_kitchen_01_fouet_red
                , R.drawable.fr_my_home_kitchen_01_cocotte_minute_red
                , R.drawable.fr_my_home_kitchen_01_lepluche_legumes_red
                , R.drawable.fr_my_home_kitchen_01_lecumoire_red
                , R.drawable.fr_my_home_kitchen_01_passoire_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_004, 1)
                , soundFactory.getSound(R.string.mp3_home_005, 1)
                , soundFactory.getSound(R.string.mp3_home_006, 1)
                , soundFactory.getSound(R.string.mp3_home_007, 1)
                , soundFactory.getSound(R.string.mp3_home_008, 1)
                , soundFactory.getSound(R.string.mp3_home_009, 1)
                , soundFactory.getSound(R.string.mp3_home_010, 1)
                , soundFactory.getSound(R.string.mp3_home_011, 1)
                , soundFactory.getSound(R.string.mp3_home_012, 1)
                , soundFactory.getSound(R.string.mp3_home_013, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_kitchen_q1_cravate)
                , getResources().getIntArray(R.array.home_kitchen_q1_lepingle)
                , getResources().getIntArray(R.array.home_kitchen_q1_chausse)
                , getResources().getIntArray(R.array.home_kitchen_q1_bijou)
                , getResources().getIntArray(R.array.home_kitchen_q1_maquillage)
                , getResources().getIntArray(R.array.home_kitchen_q1_fouet)
                , getResources().getIntArray(R.array.home_kitchen_q1_cocotte)
                , getResources().getIntArray(R.array.home_kitchen_q1_lepluche)
                , getResources().getIntArray(R.array.home_kitchen_q1_lecumoire)
                , getResources().getIntArray(R.array.home_kitchen_q1_passoire)
        };
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(KitchenQ2.class);
    }
}
