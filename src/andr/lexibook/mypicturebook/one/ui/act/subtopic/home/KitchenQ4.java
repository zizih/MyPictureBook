package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.Home;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ4 extends HomeBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        al_bg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_));
        ll_fg.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_04_image_normal));
        gif_subtopic.setMovieAsset(getString(R.string.gif_home_anim_q04));

        rightCount = 9;
        q_soundId = soundFactory.getPrioritySound(R.string.mp3_home_037);
        greenDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_04_plat_green
                , R.drawable.fr_my_home_kitchen_04_cuillere_green
                , R.drawable.fr_my_home_kitchen_04_verre_green
                , R.drawable.fr_my_home_kitchen_04_fourchette_green
                , R.drawable.fr_my_home_kitchen_04_bol_green
                , R.drawable.fr_my_home_kitchen_04_serviette_green
                , R.drawable.fr_my_home_kitchen_04_couteau_green
                , R.drawable.fr_my_home_kitchen_04_tasse_green
                , R.drawable.fr_my_home_kitchen_04_lassiette_green
                , R.drawable.fr_my_home_kitchen_04_marteau_green
        };
        grayDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_04_plat_grey
                , R.drawable.fr_my_home_kitchen_04_cuillere_grey
                , R.drawable.fr_my_home_kitchen_04_verre_grey
                , R.drawable.fr_my_home_kitchen_04_fourchette_grey
                , R.drawable.fr_my_home_kitchen_04_bol_grey
                , R.drawable.fr_my_home_kitchen_04_serviette_grey
                , R.drawable.fr_my_home_kitchen_04_couteau_grey
                , R.drawable.fr_my_home_kitchen_04_tasse_grey
                , R.drawable.fr_my_home_kitchen_04_lassiette_grey
                , R.drawable.fr_my_home_kitchen_04_marteau_grey
        };
        redDrawables = new int[]{
                R.drawable.fr_my_home_kitchen_04_plat_red
                , R.drawable.fr_my_home_kitchen_04_cuillere_red
                , R.drawable.fr_my_home_kitchen_04_verre_red
                , R.drawable.fr_my_home_kitchen_04_fourchette_red
                , R.drawable.fr_my_home_kitchen_04_bol_red
                , R.drawable.fr_my_home_kitchen_04_serviette_red
                , R.drawable.fr_my_home_kitchen_04_couteau_red
                , R.drawable.fr_my_home_kitchen_04_tasse_red
                , R.drawable.fr_my_home_kitchen_04_lassiette_red
                , R.drawable.fr_my_home_kitchen_04_marteau_red
        };
        sounds = new int[]{
                soundFactory.getSound(R.string.mp3_home_038, 1)
                , soundFactory.getSound(R.string.mp3_home_039, 1)
                , soundFactory.getSound(R.string.mp3_home_040, 1)
                , soundFactory.getSound(R.string.mp3_home_041, 1)
                , soundFactory.getSound(R.string.mp3_home_042, 1)
                , soundFactory.getSound(R.string.mp3_home_043, 1)
                , soundFactory.getSound(R.string.mp3_home_044, 1)
                , soundFactory.getSound(R.string.mp3_home_045, 1)
                , soundFactory.getSound(R.string.mp3_home_046, 1)
                , soundFactory.getSound(R.string.mp3_home_047, 1)
        };
        locations = new int[][]{
                getResources().getIntArray(R.array.home_kitchen_q4_plat)
                , getResources().getIntArray(R.array.home_kitchen_q4_cuillere)
                , getResources().getIntArray(R.array.home_kitchen_q4_verre)
                , getResources().getIntArray(R.array.home_kitchen_q4_fourchette)
                , getResources().getIntArray(R.array.home_kitchen_q4_bol)
                , getResources().getIntArray(R.array.home_kitchen_q4_serviette)
                , getResources().getIntArray(R.array.home_kitchen_q4_coutean)
                , getResources().getIntArray(R.array.home_kitchen_q4_tasse)
                , getResources().getIntArray(R.array.home_kitchen_q4_lassiette)
                , getResources().getIntArray(R.array.home_kitchen_q4_marteau)
        };
    }

    @Override
    public void toNext() {
        super.toNext();
        toPage(Home.class);
    }
}
