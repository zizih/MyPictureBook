package andr.lexibook.mypicturebook.one.ui.act.quiz;

import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.city.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday.*;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.home.*;
import andr.lexibook.mypicturebook.one.util.RandomUtil;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class Quiz extends BaseActivity {

    private int[][] order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        order = RandomUtil.getQuestionOrder();
        for (int i = 0; i < order.length; i++) {

        }
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

    private Class[][][] questions = {homes, citys, hobbies, holidays};
}
