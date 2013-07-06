package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ2 extends HomeBase {


    private LinearLayout ll_a2_beurre;
    private LinearLayout ll_a2_farine;
    private LinearLayout ll_a2_huile;
    private LinearLayout ll_a2_lait;
    private LinearLayout ll_a2_leau;
    private LinearLayout ll_a2_moutarde;
    private LinearLayout ll_a2_poivre;
    private LinearLayout ll_a2_sel;
    private LinearLayout ll_a2_sucre;
    private LinearLayout ll_a2_vinaigre;

    private int[] a2_beurre_location;
    private int[] a2_farine_location;
    private int[] a2_huile_location;
    private int[] a2_lait_location;
    private int[] a2_leau_location;
    private int[] a2_moutarde_location;
    private int[] a2_poivre_location;
    private int[] a2_sel_location;
    private int[] a2_sucre_location;
    private int[] a2_vinaigre_location;


    private int q2_soundId;

    private int a2_beurre_soundId;
    private int a2_farine_soundId;
    private int a2_huile_soundId;
    private int a2_lait_soundId;
    private int a2_leau_soundId;
    private int a2_moutarde_soundId;
    private int a2_poivre_soundId;
    private int a2_sel_soundId;
    private int a2_sucre_soundId;
    private int a2_vinaigre_soundId;

    private boolean a2_beurre = false;
    private boolean a2_farine = false;
    private boolean a2_huile = false;
    private boolean a2_lait = false;
    private boolean a2_leau = false;
    private boolean a2_moutarde = false;
    private boolean a2_poivre = false;
    private boolean a2_sel = false;
    private boolean a2_sucre = false;
    private boolean a2_vinaigre = false;

    private boolean a2_sucre_gray = false;
    private boolean a2_farine_gray = false;
    private boolean a2_sel_gray = false;
    private boolean a2_poivre_gray = false;
    private boolean a2_beurre_gray = false;
    private boolean a2_moutarde_gray = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_q2);

        ll_a2_beurre = (LinearLayout) findViewById(R.id.ll_a2_beurre);
        ll_a2_farine = (LinearLayout) findViewById(R.id.ll_a2_farine);
        ll_a2_huile = (LinearLayout) findViewById(R.id.ll_a2_huile);
        ll_a2_lait = (LinearLayout) findViewById(R.id.ll_a2_huile);
        ll_a2_leau = (LinearLayout) findViewById(R.id.ll_a2_leau);
        ll_a2_moutarde = (LinearLayout) findViewById(R.id.ll_a2_moutarde);
        ll_a2_poivre = (LinearLayout) findViewById(R.id.ll_a2_poivre);
        ll_a2_sel = (LinearLayout) findViewById(R.id.ll_a2_sel);
        ll_a2_sucre = (LinearLayout) findViewById(R.id.ll_a2_sucre);
        ll_a2_vinaigre = (LinearLayout) findViewById(R.id.ll_a2_vinaigre);

        a2_beurre_location = getResources().getIntArray(R.array.home_kitchen_q2_beurre);
        a2_farine_location = getResources().getIntArray(R.array.home_kitchen_q2_farine);
        a2_huile_location = getResources().getIntArray(R.array.home_kitchen_q2_huile);
        a2_lait_location = getResources().getIntArray(R.array.home_kitchen_q2_lait);
        a2_leau_location = getResources().getIntArray(R.array.home_kitchen_q2_leau);
        a2_moutarde_location = getResources().getIntArray(R.array.home_kitchen_q2_moutarde);
        a2_poivre_location = getResources().getIntArray(R.array.home_kitchen_q2_poivre);
        a2_sel_location = getResources().getIntArray(R.array.home_kitchen_q2_sel);
        a2_sucre_location = getResources().getIntArray(R.array.home_kitchen_q2_sucre);
        a2_vinaigre_location = getResources().getIntArray(R.array.home_kitchen_q2_vinaigre);

        a2_leau_soundId = soundFactory.getSound(R.string.mp3_home_015, 1);
        a2_lait_soundId = soundFactory.getSound(R.string.mp3_home_016, 1);
        a2_huile_soundId = soundFactory.getSound(R.string.mp3_home_017, 1);
        a2_vinaigre_soundId = soundFactory.getSound(R.string.mp3_home_018, 1);
        a2_sucre_soundId = soundFactory.getSound(R.string.mp3_home_019, 1);
        a2_farine_soundId = soundFactory.getSound(R.string.mp3_home_020, 1);
        a2_sel_soundId = soundFactory.getSound(R.string.mp3_home_021, 1);
        a2_poivre_soundId = soundFactory.getSound(R.string.mp3_home_022, 1);
        a2_beurre_soundId = soundFactory.getSound(R.string.mp3_home_023, 1);
        a2_moutarde_soundId = soundFactory.getSound(R.string.mp3_home_024, 1);

        q2_soundId = soundFactory.getPrioritySound(R.string.mp3_home_014);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            toGray();
            if (checkLocation(event, next_location)) {

            }
            if (checkLocation(event, media_location)) {
                priorityPool.play(q2_soundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, a2_leau_location)) {
                pool.play(a2_leau_soundId, 1, 1, 0, 0, 1);
                if (!a2_leau) {
                    ll_a2_leau.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_leau_red));
                    a2_leau = true;
                }
            }
            if (checkLocation(event, a2_lait_location)) {
                pool.play(a2_lait_soundId, 1, 1, 0, 0, 1);
                if (!a2_lait) {
                    ll_a2_lait.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_lait_red));
                    a2_lait = true;
                }
            }
            if (checkLocation(event, a2_huile_location)) {
                pool.play(a2_huile_soundId, 1, 1, 0, 0, 1);
                if (!a2_huile) {
                    ll_a2_huile.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_huile_red));
                    a2_huile = true;
                }
            }
            if (checkLocation(event, a2_vinaigre_location)) {
                pool.play(a2_vinaigre_soundId, 1, 1, 0, 0, 1);
                if (!a2_vinaigre) {
                    ll_a2_vinaigre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_vinaigre_red));
                    a2_vinaigre = true;
                }
            }
            if (checkLocation(event, a2_sucre_location)) {
                pool.play(a2_sucre_soundId, 1, 1, 0, 0, 1);
                if (!a2_sucre) {
                    ll_a2_sucre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sucre_green));
                    a2_sucre = true;
                }
            }
            if (checkLocation(event, a2_farine_location)) {
                pool.play(a2_farine_soundId, 1, 1, 0, 0, 1);
                if (!a2_farine) {
                    ll_a2_farine.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_farine_green));
                    a2_farine = true;
                }
            }
            if (checkLocation(event, a2_sel_location)) {
                pool.play(a2_sel_soundId, 1, 1, 0, 0, 1);
                if (!a2_sel) {
                    ll_a2_sel.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sel_green));
                    a2_sel = true;
                }
            }
            if (checkLocation(event, a2_poivre_location)) {
                pool.play(a2_poivre_soundId, 1, 1, 0, 0, 1);
                if (!a2_poivre) {
                    ll_a2_poivre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_poivre_green));
                    a2_poivre = true;
                }
            }
            if (checkLocation(event, a2_beurre_location)) {
                pool.play(a2_beurre_soundId, 1, 1, 0, 0, 1);
                if (!a2_beurre) {
                    ll_a2_beurre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_beurre_green));
                    a2_beurre = true;
                }
            }
            if (checkLocation(event, a2_moutarde_location)) {
                pool.play(a2_moutarde_soundId, 1, 1, 0, 0, 1);
                if (!a2_moutarde) {
                    ll_a2_moutarde.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_moutarde_green));
                    a2_moutarde = true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        pool.unload(a2_leau_soundId);
        pool.unload(a2_lait_soundId);
        pool.unload(a2_huile_soundId);
        pool.unload(a2_vinaigre_soundId);
        pool.unload(a2_sucre_soundId);
        pool.unload(a2_sel_soundId);
        pool.unload(a2_poivre_soundId);
        pool.unload(a2_beurre_soundId);
        pool.unload(a2_beurre_soundId);
        pool.unload(a2_moutarde_soundId);
        priorityPool.unload(q2_soundId);
        super.toPage(cls);
    }

    public void toGray() {
        if (a2_sucre && !a2_sucre_gray) {
            ll_a2_sucre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sucre_grey));
            a2_sucre_gray = true;
        }
        if (a2_farine && !a2_farine_gray) {
            ll_a2_farine.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_farine_grey));
            a2_farine_gray = true;
        }
        if (a2_sel && !a2_sel_gray) {
            ll_a2_sel.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_sel_grey));
            a2_sel_gray = true;
        }
        if (a2_poivre && !a2_poivre_gray) {
            ll_a2_poivre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_poivre_grey));
            a2_poivre_gray = true;
        }
        if (a2_beurre && !a2_beurre_gray) {
            ll_a2_beurre.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_beurre_grey));
            a2_beurre_gray = true;
        }
        if (a2_moutarde && !a2_moutarde_gray) {
            ll_a2_moutarde.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_02_moutarde_grey));
            a2_moutarde_gray = true;
        }
    }
}
