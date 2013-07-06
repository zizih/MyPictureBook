package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ2 extends HomeBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr__q01_my_home_kitchen_02));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_image_normal));

        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_014);
        greenDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_02_leau_green
                , R.drawable.fr_my_home_kitchen_02_lait_green
                , R.drawable.fr_my_home_kitchen_02_huile_green
                , R.drawable.fr_my_home_kitchen_02_vinaigre_green
                , R.drawable.fr_my_home_kitchen_02_sucre_green
                , R.drawable.fr_my_home_kitchen_02_farine_green
                , R.drawable.fr_my_home_kitchen_02_sel_green
                , R.drawable.fr_my_home_kitchen_02_poivre_green
                , R.drawable.fr_my_home_kitchen_02_beurre_green
                , R.drawable.fr_my_home_kitchen_02_moutarde_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_02_leau_grey
                , R.drawable.fr_my_home_kitchen_02_lait_grey
                , R.drawable.fr_my_home_kitchen_02_huile_grey
                , R.drawable.fr_my_home_kitchen_02_vinaigre_grey
                , R.drawable.fr_my_home_kitchen_02_sucre_grey
                , R.drawable.fr_my_home_kitchen_02_farine_grey
                , R.drawable.fr_my_home_kitchen_02_sel_grey
                , R.drawable.fr_my_home_kitchen_02_poivre_grey
                , R.drawable.fr_my_home_kitchen_02_beurre_grey
                , R.drawable.fr_my_home_kitchen_02_moutarde_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_02_leau_red
                , R.drawable.fr_my_home_kitchen_02_lait_red
                , R.drawable.fr_my_home_kitchen_02_huile_red
                , R.drawable.fr_my_home_kitchen_02_vinaigre_red
                , R.drawable.fr_my_home_kitchen_02_sucre_red
                , R.drawable.fr_my_home_kitchen_02_farine_red
                , R.drawable.fr_my_home_kitchen_02_sel_red
                , R.drawable.fr_my_home_kitchen_02_poivre_red
                , R.drawable.fr_my_home_kitchen_02_beurre_red
                , R.drawable.fr_my_home_kitchen_02_moutarde_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_015, 1)
                , soundFactory.getSound(R.string.mp3_home_016, 1)
                , soundFactory.getSound(R.string.mp3_home_017, 1)
                , soundFactory.getSound(R.string.mp3_home_018, 1)
                , soundFactory.getSound(R.string.mp3_home_019, 1)
                , soundFactory.getSound(R.string.mp3_home_020, 1)
                , soundFactory.getSound(R.string.mp3_home_021, 1)
                , soundFactory.getSound(R.string.mp3_home_022, 1)
                , soundFactory.getSound(R.string.mp3_home_023, 1)
                , soundFactory.getSound(R.string.mp3_home_024, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_kitchen_q2_leau)
                , getResources().getIntArray(R.array.home_kitchen_q2_lait)
                , getResources().getIntArray(R.array.home_kitchen_q2_huile)
                , getResources().getIntArray(R.array.home_kitchen_q2_vinaigre)
                , getResources().getIntArray(R.array.home_kitchen_q2_sucre)
                , getResources().getIntArray(R.array.home_kitchen_q2_farine)
                , getResources().getIntArray(R.array.home_kitchen_q2_sel)
                , getResources().getIntArray(R.array.home_kitchen_q2_poivre)
                , getResources().getIntArray(R.array.home_kitchen_q2_beurre)
                , getResources().getIntArray(R.array.home_kitchen_q2_moutarde)
        };
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(KitchenQ3.class);
    }
}
