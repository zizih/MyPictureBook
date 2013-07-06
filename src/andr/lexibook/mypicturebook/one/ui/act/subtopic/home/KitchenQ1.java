package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by rain on 7/3/13.
 */
public class KitchenQ1 extends HomeBase {


    private LinearLayout ll_a1_bijou;
    private LinearLayout ll_a1_chausse;
    private LinearLayout ll_a1_cocotte;
    private LinearLayout ll_a1_cravate;
    private LinearLayout ll_a1_fouet;
    private LinearLayout ll_a1_lecumoire;
    private LinearLayout ll_a1_lepingle;
    private LinearLayout ll_a1_lepluche;
    private LinearLayout ll_a1_maquillage;
    private LinearLayout ll_a1_passoire;

    private int[] a1_bijou_location;
    private int[] a1_chausse_location;
    private int[] a1_cocotte_location;
    private int[] a1_cravate_location;
    private int[] a1_fouet_location;
    private int[] a1_lecumoire_location;
    private int[] a1_lepingle_location;
    private int[] a1_lepluche_location;
    private int[] a1_maquillage_location;
    private int[] a1_passoire_location;

    private int q1_soundId;

    private int a1_bijou_soundId;
    private int a1_chausse_soundId;
    private int a1_cocotte_soundId;
    private int a1_cravate_soundId;
    private int a1_fouet_soundId;
    private int a1_lecumoire_soundId;
    private int a1_lepingle_soundId;
    private int a1_lepluche_soundId;
    private int a1_maquillage_soundId;
    private int a1_passoire_soundId;

    private boolean a1_bijou = false;
    private boolean a1_chausse = false;
    private boolean a1_cocotte = false;
    private boolean a1_cravate = false;
    private boolean a1_fouet = false;
    private boolean a1_lecumoire = false;
    private boolean a1_lepingle = false;
    private boolean a1_lepluche = false;
    private boolean a1_maquillage = false;
    private boolean a1_passoire = false;

    private boolean a1_cocotte_gray = false;
    private boolean a1_fouet_gray = false;
    private boolean a1_lecumoire_gray = false;
    private boolean a1_lepluche_gray = false;
    private boolean a1_passoire_gray = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_q1);

        ll_a1_bijou = (LinearLayout) findViewById(R.id.ll_a1_bijou);
        ll_a1_chausse = (LinearLayout) findViewById(R.id.ll_a1_chausse);
        ll_a1_cocotte = (LinearLayout) findViewById(R.id.ll_a1_cocotte);
        ll_a1_cravate = (LinearLayout) findViewById(R.id.ll_a1_cravate);
        ll_a1_fouet = (LinearLayout) findViewById(R.id.ll_a1_fouet);
        ll_a1_lecumoire = (LinearLayout) findViewById(R.id.ll_a1_lecumoire);
        ll_a1_lepingle = (LinearLayout) findViewById(R.id.ll_a1_lepingle);
        ll_a1_lepluche = (LinearLayout) findViewById(R.id.ll_a1_lepluche);
        ll_a1_maquillage = (LinearLayout) findViewById(R.id.ll_a1_maquillage);
        ll_a1_passoire = (LinearLayout) findViewById(R.id.ll_a1_passoire);

        a1_bijou_location = getResources().getIntArray(R.array.home_kitchen_q1_bijou);
        a1_chausse_location = getResources().getIntArray(R.array.home_kitchen_q1_chausse);
        a1_cocotte_location = getResources().getIntArray(R.array.home_kitchen_q1_cocotte);
        a1_cravate_location = getResources().getIntArray(R.array.home_kitchen_q1_cravate);
        a1_fouet_location = getResources().getIntArray(R.array.home_kitchen_q1_fouet);
        a1_lecumoire_location = getResources().getIntArray(R.array.home_kitchen_q1_lecumoire);
        a1_lepingle_location = getResources().getIntArray(R.array.home_kitchen_q1_lepingle);
        a1_lepluche_location = getResources().getIntArray(R.array.home_kitchen_q1_lepluche);
        a1_maquillage_location = getResources().getIntArray(R.array.home_kitchen_q1_maquillage);
        a1_passoire_location = getResources().getIntArray(R.array.home_kitchen_q1_passoire);


        a1_cravate_soundId = soundFactory.getSound(R.string.mp3_home_004, 1);
        a1_lepingle_soundId = soundFactory.getSound(R.string.mp3_home_005, 1);
        a1_chausse_soundId = soundFactory.getSound(R.string.mp3_home_006, 1);
        a1_bijou_soundId = soundFactory.getSound(R.string.mp3_home_007, 1);
        a1_maquillage_soundId = soundFactory.getSound(R.string.mp3_home_008, 1);
        a1_fouet_soundId = soundFactory.getSound(R.string.mp3_home_009, 1);
        a1_cocotte_soundId = soundFactory.getSound(R.string.mp3_home_010, 1);
        a1_lepluche_soundId = soundFactory.getSound(R.string.mp3_home_011, 1);
        a1_lecumoire_soundId = soundFactory.getSound(R.string.mp3_home_012, 1);
        a1_passoire_soundId = soundFactory.getSound(R.string.mp3_home_013, 1);

        q1_soundId = soundFactory.getPrioritySound(R.string.mp3_home_003);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            toGray();
            if (checkLocation(event, next_location)) {
                toPage(KitchenQ2.class);
            }
            if (checkLocation(event, media_location)) {
                priorityPool.play(q1_soundId, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, a1_cravate_location)) {
                pool.play(a1_cravate_soundId, 1, 1, 0, 0, 1);
                if (!a1_cravate) {
                    ll_a1_cravate.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_cravate_red));
                    a1_cravate = true;
                }
            }
            if (checkLocation(event, a1_lepingle_location)) {
                pool.play(a1_lepingle_soundId, 1, 1, 0, 0, 1);
                if (!a1_lepingle) {
                    ll_a1_lepingle.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_lepingle_red));
                    a1_lepingle = true;
                }
            }
            if (checkLocation(event, a1_chausse_location)) {
                pool.play(a1_chausse_soundId, 1, 1, 0, 0, 1);
                if (!a1_chausse) {
                    ll_a1_chausse.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_chausse_pied_red));
                    a1_chausse = true;
                }
            }
            if (checkLocation(event, a1_bijou_location)) {
                pool.play(a1_bijou_soundId, 1, 1, 0, 0, 1);
                if (!a1_bijou) {
                    ll_a1_bijou.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_bijou_red));
                    a1_bijou = true;
                }
            }
            if (checkLocation(event, a1_maquillage_location)) {
                pool.play(a1_maquillage_soundId, 1, 1, 0, 0, 1);
                if (!a1_maquillage) {
                    ll_a1_maquillage.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_maquillage_red));
                    a1_maquillage = true;
                }
            }
            if (checkLocation(event, a1_fouet_location)) {
                pool.play(a1_fouet_soundId, 1, 1, 0, 0, 1);
                System.out.println("fouet: " + a1_fouet);
                if (!a1_fouet) {
                    ll_a1_fouet.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_fouet_green));
                    a1_fouet = true;
                }
            }
            if (checkLocation(event, a1_cocotte_location)) {
                pool.play(a1_cocotte_soundId, 1, 1, 0, 0, 1);
                if (!a1_cocotte) {
                    ll_a1_cocotte.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_cocotte_minute_green));
                    a1_cocotte = true;
                }
            }
            if (checkLocation(event, a1_lepluche_location)) {
                pool.play(a1_lepluche_soundId, 1, 1, 0, 0, 1);
                if (!a1_lepluche) {
                    ll_a1_lepluche.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_lepluche_legumes_green));
                    a1_lepluche = true;
                }
            }
            if (checkLocation(event, a1_lecumoire_location)) {
                pool.play(a1_lecumoire_soundId, 1, 1, 0, 0, 1);
                if (!a1_lecumoire) {
                    ll_a1_lecumoire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_lecumoire_green));
                    a1_lecumoire = true;
                }
            }
            if (checkLocation(event, a1_passoire_location)) {
                pool.play(a1_passoire_soundId, 1, 1, 0, 0, 1);
                if (!a1_passoire) {
                    ll_a1_passoire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_passoire_green));
                    a1_passoire = true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void toPage(Class<?> cls) {
        pool.unload(a1_bijou_soundId);
        pool.unload(a1_chausse_soundId);
        pool.unload(a1_cocotte_soundId);
        pool.unload(a1_cravate_soundId);
        pool.unload(a1_fouet_soundId);
        pool.unload(a1_lecumoire_soundId);
        pool.unload(a1_lepingle_soundId);
        pool.unload(a1_lepluche_soundId);
        pool.unload(a1_maquillage_soundId);
        pool.unload(a1_passoire_soundId);
        priorityPool.unload(q1_soundId);
        super.toPage(cls);
        finish();
    }

    public void toGray() {
        if (a1_fouet && !a1_fouet_gray) {
            ll_a1_fouet.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_fouet_grey));
            a1_fouet_gray = true;
        }
        if (a1_cocotte && !a1_cocotte_gray) {
            ll_a1_cocotte.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_cocotte_minute_grey1));
            a1_cocotte_gray = true;
        }
        if (a1_lepluche && !a1_lepluche_gray) {
            ll_a1_lepluche.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_lepluche_legumes_grey));
            a1_lepluche_gray = true;
        }
        if (a1_lecumoire && !a1_lecumoire_gray) {
            ll_a1_lecumoire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_lecumoire_grey));
            a1_lecumoire_gray = true;
        }
        if (a1_passoire && !a1_passoire_gray) {
            ll_a1_passoire.setBackgroundDrawable(getResources().getDrawable(R.drawable.fr_my_home_kitchen_01_passoire_grey));
            a1_passoire_gray = true;
        }
    }


}
