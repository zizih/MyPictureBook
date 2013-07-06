package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ3 extends HomeBase {


    private LinearLayout ll_a3_banane;
    private LinearLayout ll_a3_carotte;
    private LinearLayout ll_a3_chou;
    private LinearLayout ll_a3_concombre;
    private LinearLayout ll_a3_fraise;
    private LinearLayout ll_a3_lorange;
    private LinearLayout ll_a3_poire;
    private LinearLayout ll_a3_poireau;
    private LinearLayout ll_a3_pomme_de;
    private LinearLayout ll_a3_pomme;

    private int[] a3_banane_location;
    private int[] a3_carotte_location;
    private int[] a3_chou_location;
    private int[] a3_concombre_location;
    private int[] a3_fraise_location;
    private int[] a3_lorange_location;
    private int[] a3_poire_location;
    private int[] a3_poireau_location;
    private int[] a3_pomme_de_location;
    private int[] a3_pomme_location;

    private int q3a_soundId;
    private int q3b_soundId;

    private int a3_banane_soundId;
    private int a3_carotte_soundId;
    private int a3_chou_soundId;
    private int a3_concombre_soundId;
    private int a3_fraise_soundId;
    private int a3_lorange_soundId;
    private int a3_poire_soundId;
    private int a3_poireau_soundId;
    private int a3_pomme_de_soundId;
    private int a3_pomme_soundId;

    private boolean a3_banane = false;
    private boolean a3_carotte = false;
    private boolean a3_chou = false;
    private boolean a3_concombre = false;
    private boolean a3_lorange = false;
    private boolean a3_fraise = false;
    private boolean a3_poire = false;
    private boolean a3_poireau = false;
    private boolean a3_pomme_de = false;
    private boolean a3_pomme = false;

    private boolean a3_lorange_gray = false;
    private boolean a3_pomme_gray = false;
    private boolean a3_fraise_gray = false;
    private boolean a3_banane_gray = false;
    private boolean a3_poire_gray = false;

    private boolean a3_chou_gray = false;
    private boolean a3_poireau_gray = false;
    private boolean a3_pomme_de_gray = false;
    private boolean a3_carotte_gray = false;
    private boolean a3_concombre_gray = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_q3);

        ll_a3_banane = (LinearLayout) findViewById(R.id.ll_a3_banane);
        ll_a3_carotte = (LinearLayout) findViewById(R.id.ll_a3_carotte);
        ll_a3_chou = (LinearLayout) findViewById(R.id.ll_a3_chou);
        ll_a3_concombre = (LinearLayout) findViewById(R.id.ll_a3_concombre);
        ll_a3_fraise = (LinearLayout) findViewById(R.id.ll_a3_fraise);
        ll_a3_lorange = (LinearLayout) findViewById(R.id.ll_a3_lorange);
        ll_a3_poire = (LinearLayout) findViewById(R.id.ll_a3_poire);
        ll_a3_poireau = (LinearLayout) findViewById(R.id.ll_a3_poireau);
        ll_a3_pomme_de = (LinearLayout) findViewById(R.id.ll_a3_pomme_de);
        ll_a3_pomme = (LinearLayout) findViewById(R.id.ll_a3_pomme);

        a3_banane_location = getResources().getIntArray(R.array.home_kitchen_q3_banane);
        a3_carotte_location = getResources().getIntArray(R.array.home_kitchen_q3_carotte);
        a3_chou_location = getResources().getIntArray(R.array.home_kitchen_q3_chou);
        a3_concombre_location = getResources().getIntArray(R.array.home_kitchen_q3_concombre);
        a3_fraise_location = getResources().getIntArray(R.array.home_kitchen_q3_fraise);
        a3_lorange_location = getResources().getIntArray(R.array.home_kitchen_q3_lorange);
        a3_poire_location = getResources().getIntArray(R.array.home_kitchen_q3_poire);
        a3_poireau_location = getResources().getIntArray(R.array.home_kitchen_q3_poireau);
        a3_pomme_de_location = getResources().getIntArray(R.array.home_kitchen_q3_pomme_de);
        a3_pomme_location = getResources().getIntArray(R.array.home_kitchen_q3_pomme);

        /**
         * soundId
         */
        a3_lorange_soundId = soundFactory.getSound(R.string.mp3_home_026, 1);
        a3_pomme_soundId = soundFactory.getSound(R.string.mp3_home_027, 1);
        a3_fraise_soundId = soundFactory.getSound(R.string.mp3_home_028, 1);
        a3_banane_soundId = soundFactory.getSound(R.string.mp3_home_029, 1);
        a3_poire_soundId = soundFactory.getSound(R.string.mp3_home_030, 1);

        a3_chou_soundId = soundFactory.getSound(R.string.mp3_home_032, 1);
        a3_poireau_soundId = soundFactory.getSound(R.string.mp3_home_033, 1);
        a3_pomme_de_soundId = soundFactory.getSound(R.string.mp3_home_034, 1);
        a3_carotte_soundId = soundFactory.getSound(R.string.mp3_home_035, 1);
        a3_concombre_soundId = soundFactory.getSound(R.string.mp3_home_036, 1);

        q3a_soundId = soundFactory.getPrioritySound(R.string.mp3_home_025);
        q3b_soundId = soundFactory.getPrioritySound(R.string.mp3_home_031);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            toGray();
            if (checkLocation(event, next_location)) {

            }
            if (checkLocation(event, media_location)) {
                priorityPool.play(q3a_soundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, a3_fraise_location)) {
                pool.play(a3_fraise_soundId, 1, 1, 0, 0, 1);
                if (!a3_lorange) {
                    ll_a3_fraise.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_leau_red));
                    a3_lorange = true;
                }
            }
            if (checkLocation(event, a3_concombre_location)) {
                pool.play(a3_concombre_soundId, 1, 1, 0, 0, 1);
                if (!a3_concombre) {
                    ll_a3_concombre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_lait_red));
                    a3_concombre = true;
                }
            }
            if (checkLocation(event, a3_chou_location)) {
                pool.play(a3_chou_soundId, 1, 1, 0, 0, 1);
                if (!a3_chou) {
                    ll_a3_chou.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_huile_red));
                    a3_chou = true;
                }
            }
            if (checkLocation(event, a3_pomme_location)) {
                pool.play(a3_pomme_soundId, 1, 1, 0, 0, 1);
                if (!a3_pomme) {
                    ll_a3_pomme.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_vinaigre_red));
                    a3_pomme = true;
                }
            }
            if (checkLocation(event, a3_pomme_de_location)) {
                pool.play(a3_pomme_de_soundId, 1, 1, 0, 0, 1);
                if (!a3_pomme_de) {
                    ll_a3_pomme_de.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sucre_green));
                    a3_pomme_de = true;
                }
            }
            if (checkLocation(event, a3_carotte_location)) {
                pool.play(a3_carotte_soundId, 1, 1, 0, 0, 1);
                if (!a3_carotte) {
                    ll_a3_carotte.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_farine_green));
                    a3_carotte = true;
                }
            }
            if (checkLocation(event, a3_poireau_location)) {
                pool.play(a3_poireau_soundId, 1, 1, 0, 0, 1);
                if (!a3_poireau) {
                    ll_a3_poireau.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sel_green));
                    a3_poireau = true;
                }
            }
            if (checkLocation(event, a3_poire_location)) {
                pool.play(a3_poire_soundId, 1, 1, 0, 0, 1);
                if (!a3_poire) {
                    ll_a3_poire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_poivre_green));
                    a3_poire = true;
                }
            }
            if (checkLocation(event, a3_banane_location)) {
                pool.play(a3_banane_soundId, 1, 1, 0, 0, 1);
                if (!a3_banane) {
                    ll_a3_banane.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_beurre_green));
                    a3_banane = true;
                }
            }
            if (checkLocation(event, a3_lorange_location)) {
                pool.play(a3_lorange_soundId, 1, 1, 0, 0, 1);
                if (!a3_fraise) {
                    ll_a3_lorange.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_moutarde_green));
                    a3_fraise = true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        pool.unload(a3_fraise_soundId);
        pool.unload(a3_concombre_soundId);
        pool.unload(a3_chou_soundId);
        pool.unload(a3_pomme_soundId);
        pool.unload(a3_pomme_de_soundId);
        pool.unload(a3_poireau_soundId);
        pool.unload(a3_poire_soundId);
        pool.unload(a3_banane_soundId);
        pool.unload(a3_banane_soundId);
        pool.unload(a3_lorange_soundId);
        priorityPool.unload(q3a_soundId);
        super.toPage(cls);
    }

    public void toGray() {
        if (a3_pomme_de && !a3_lorange_gray) {
            ll_a3_pomme_de.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_03_pomme_de_terre_grey));
            a3_lorange_gray = true;
        }
        if (a3_carotte && !a3_pomme_gray) {
            ll_a3_carotte.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_farine_grey));
            a3_pomme_gray = true;
        }
        if (a3_poireau && !a3_fraise_gray) {
            ll_a3_poireau.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sel_grey));
            a3_fraise_gray = true;
        }
        if (a3_poire && !a3_banane_gray) {
            ll_a3_poire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_poivre_grey));
            a3_banane_gray = true;
        }
        if (a3_banane && !a3_poire_gray) {
            ll_a3_banane.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_beurre_grey));
            a3_poire_gray = true;
        }
    }
}
