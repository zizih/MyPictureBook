package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.control.SrcTool;
import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.*;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;

/**
 * Created by rain on 7/3/13.
 */
@SuppressWarnings("deprecation")
public class SubBase extends BaseActivity {

    private SrcTool Tool;
    private int qIndex = 0;
    private boolean hasNextQuestion = false;
    private Class nexPage;
    private Class homeClass;

    private int[] home_location;
    private int[] next_location;
    private int[] media_location;

    private Handler mHandler;
    private ToGrayThread toGrayThead;
    private AbsoluteLayout alBg;
    private LinearLayout llFg;
    private LinearLayout llTxt;
    private GifMovieView gifA;
    private GifMovieView gifB;
    private GifMovieView gifC;
    private GifMovieView gifD;

    private LinearLayout[] lls;
    private int[] aSounds;
    private int[][] locations;
    private boolean[] ifClicks = {false, false, false, false, false, false, false, false, false, false};
    private boolean[] ifGrays = {false, false, false, false, false, false, false, false, false, false};

    private int[] greenIds;
    private int[] grayIds;
    private int[] redIds;

    private int qSound;
    private int rightCount = 5; //default

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        Tool = SrcTool.getInstance();
        alBg = (AbsoluteLayout) findViewById(R.id.al_subtopic_layout);
        llFg = (LinearLayout) findViewById(R.id.ll_subtopic_fore_img);
        llTxt = (LinearLayout) findViewById(R.id.ll_subtopic_fore_lang);
        gifA = (GifMovieView) findViewById(R.id.gif_subtopic);
        gifB = (GifMovieView) findViewById(R.id.gif_subtopic_b);
        gifC = (GifMovieView) findViewById(R.id.gif_subtopic_c);
        gifD = (GifMovieView) findViewById(R.id.gif_subtopic_d);

        home_location = getResources().getIntArray(R.array.home_kitchen_home);
        next_location = getResources().getIntArray(R.array.home_kitchen_next);
        media_location = getResources().getIntArray(R.array.home_kitchen_media);
        mHandler = new Handler();
        toGrayThead = new ToGrayThread();
        lls = new LinearLayout[]{
                (LinearLayout) findViewById(R.id.ll_subtopic_a01),
                (LinearLayout) findViewById(R.id.ll_subtopic_a02),
                (LinearLayout) findViewById(R.id.ll_subtopic_a03),
                (LinearLayout) findViewById(R.id.ll_subtopic_a04),
                (LinearLayout) findViewById(R.id.ll_subtopic_a05),
                (LinearLayout) findViewById(R.id.ll_subtopic_a06),
                (LinearLayout) findViewById(R.id.ll_subtopic_a07),
                (LinearLayout) findViewById(R.id.ll_subtopic_a08),
                (LinearLayout) findViewById(R.id.ll_subtopic_a09),
                (LinearLayout) findViewById(R.id.ll_subtopic_a10)
        };
    }

    class ToGrayThread implements Runnable {

        @Override
        public void run() {
            (SubBase.this).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    toGray();
                }
            });
        }
    }

    public void toGray() {
        if (!hasNextQuestion) {
            for (int i = 0; i < rightCount; i++) {
                if (ifClicks[i] && !ifGrays[i]) {
                    lls[i].setBackgroundDrawable(getResources().getDrawable(grayIds[i]));
                    ifGrays[i] = true;
                }
            }
        } else {
            for (int i = rightCount; i < 10; i++) {
                if (ifClicks[i] && !ifGrays[i]) {
                    lls[i].setBackgroundDrawable(getResources().getDrawable(grayIds[i]));
                    ifGrays[i] = true;
                }
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (checkLocation(event, home_location))
                if (homeClass != null) {
                    toPage(homeClass);
                } else {
                    toPage(Home.class);
                }
            if (checkLocation(event, media_location)) {
                priorityPool.play(qSound, 1, 1, 0, 0, 1);
            }
            if (checkLocation(event, next_location)) {
                toNext();
            }
            for (int i = 0; i < rightCount; i++) {
                if (checkLocation(event, locations[i])) {
                    pool.play(aSounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        if (!hasNextQuestion) {
                            lls[i].setBackgroundDrawable(getResources().getDrawable(greenIds[i]));
                        } else {
                            lls[i].setBackgroundDrawable(getResources().getDrawable(redIds[i]));
                        }
                        ifClicks[i] = true;
                    }
                }
            }
            for (int i = rightCount; i < 10; i++) {
                if (checkLocation(event, locations[i])) {
                    pool.play(aSounds[i], 1, 1, 0, 0, 1);
                    if (!ifClicks[i]) {
                        if (hasNextQuestion) {
                            lls[i].setBackgroundDrawable(getResources().getDrawable(redIds[i]));
                        } else {
                            lls[i].setBackgroundDrawable(getResources().getDrawable(greenIds[i]));
                        }
                        ifClicks[i] = true;
                    }
                }
            }
            mHandler.postDelayed(toGrayThead, 1000);
        }
        return super.onTouchEvent(event);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (gifA != null) gifA.Clear();
        if (gifB != null) gifB.Clear();
        if (gifC != null) gifC.Clear();
        if (gifD != null) gifD.Clear();
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        for (int i = 0; i < 10; i++)
            pool.unload(aSounds[i]);
        priorityPool.unload(qSound);
        finish();
    }

    public void toNext() {
        if (hasNextQuestion) {
            toQB();
        } else if (nexPage != null) {
            toPage(nexPage);
        }
    }

    public void toQB() {
        hasNextQuestion = false;
        /**
         * remove bg of answer
         */
        for (int i = 0; i < 10; i++) {
            lls[i].setBackgroundDrawable(null);
            ifClicks[i] = false;
            ifGrays[i] = false;
        }
    }

    public int[] relocation(int[] src, int[] relocations) {
        int length = src.length;
        if (src.length > relocations.length) {
            length = relocations.length;
        }
        int[] tmp = new int[10];
        for (int i = 0; i < length; i++)
            tmp[i] = src[relocations[i] - 1];
        return tmp;
    }

    public int[][] relocation(int[][] src, int[] relocations) {
        int length = src.length;
        if (src.length > relocations.length) {
            length = relocations.length;
        }
        int[][] tmp = new int[10][];
        for (int i = 0; i < length; i++)
            tmp[i] = src[relocations[i] - 1];
        return tmp;
    }

    public void setHome(Class homeClass) {
        this.homeClass = homeClass;
    }

    public void setQIndex(int qIndex) {
        if (qIndex > 0) {
            qIndex--;
        }
        this.qIndex = qIndex;
        System.out.println("qIndex: " + qIndex);
        Tool.setQIndex(this.qIndex);
        setBg();
        setFg();
        setTxt();
        setAnimA();
        setGreen();
        setGrey();
        setRed();
        setLocations();
        setASounds();
        setQSound();
    }

    public void setFg() {
        llFg.setBackgroundDrawable(getResources().getDrawable(Tool.getFg()));
    }

    public void setBg() {
        alBg.setBackgroundDrawable(getResources().getDrawable(Tool.getBg()));
    }

    public void setTxt() {
        llTxt.setBackgroundDrawable(getResources().getDrawable(Tool.getFrText()));
    }

    /**
     * invoke by change language
     *
     * @param srcId
     */
    public void setTxt(int srcId) {
        llTxt.setBackgroundDrawable(getResources().getDrawable(srcId));
    }

    public void setAnimA() {
        gifA.setMovieAsset(getResources().getString(Tool.getAnim()));
    }

    public void setAnimA(int srcId) {
        gifA.setMovieAsset(getResources().getString(srcId));
    }

    public void setAnimB(int srcId) {
        gifB.setMovieAsset(getResources().getString(srcId));
    }

    public void setAnimC(int srcId) {
        gifC.setMovieAsset(getResources().getString(srcId));
    }

    public void setAnimD(int srcId) {
        gifD.setMovieAsset(getResources().getString(srcId));
    }

    public void setGreen() {
        greenIds = Tool.getGreen();
    }

    public void setGrey() {
        grayIds = Tool.getGrey();
    }

    public void setRed() {
        redIds = Tool.getRed();
    }

    public void setLocations() {
        int[] ids = Tool.getLocation();
        this.locations = new int[ids.length][4];
        for (int i = 0; i < ids.length; i++) {
            locations[i] = getResources().getIntArray(ids[i]);
        }
    }

    public void setReLocation(int... relocations) {
        greenIds = relocation(this.greenIds, relocations);
        grayIds = relocation(this.grayIds, relocations);
        redIds = relocation(this.redIds, relocations);
        locations = relocation(locations, relocations);
    }

    public void setASounds() {
        int[] ids = Tool.getASound();
        aSounds = new int[ids.length];
        for (int i = 0; i < ids.length; i++) {
            aSounds[i] = soundFactory.getSound(ids[i], 1);
        }
    }

    public void setQSound() {
        qSound = soundFactory.getPrioritySound(Tool.getQSound());
    }

    public void setQSound(int srcId) {
        qSound = soundFactory.getPrioritySound(srcId);
    }

    public void setRight(int count) {
        this.rightCount = count;
    }

    public void setNextPage(Class clzz) {
        this.nexPage = clzz;
    }

    public void setHasNextQuestion() {
        hasNextQuestion = true;
    }

    private Class[][] homes = {
            {KitchenQ01.class, KitchenQ02.class, KitchenQ03.class, KitchenQ04.class}
            , {BathroomQ05.class, BathroomQ06.class, BathroomQ07.class, BathroomQ08.class}
            , {BedroomQ09.class, BedroomQ10.class, BedroomQ11.class, BedroomQ12.class}
            , {GardenQ13.class, GardenQ14.class, GardenQ15.class, GardenQ16.class}
    };

    private Class[][] citys = {
            {TransportationQ17.class, TransportationQ18.class, TransportationQ19.class, TransportationQ20.class}
            , {ShopsQ21.class, ShopsQ22.class, ShopsQ23.class, ShopsQ24.class}
            , {SchoolQ25.class, SchoolQ26.class, SchoolQ27.class, SchoolQ28.class}
            , {JobsQ29.class, JobsQ30.class, JobsQ31.class, JobsQ32.class}
    };

    private Class[][] hobbies = {
            {SportsQ33.class, SportsQ34.class, SportsQ35.class, SportsQ36.class}
            , {MusicQ37.class, MusicQ38.class, MusicQ39.class, MusicQ40.class}
            , {DrawingQ41.class, DrawingQ42.class, DrawingQ43.class, DrawingQ44.class}
            , {OutdoorQ45.class, OutdoorQ46.class, OutdoorQ47.class, OutdoorQ48.class}
    };

    private Class[][] holidays = {
            {SeaQ49.class, SeaQ50.class}
            , {ForestQ51.class, ForestQ51.class}
            , {MountainsQ53.class, MountainsQ53.class}
            , {FarmQ55.class, FarmQ55.class}
            , {DesertQ57.class, DesertQ58.class}
    };

    public Class[][][] questions = {homes, citys, hobbies, holidays};
}
