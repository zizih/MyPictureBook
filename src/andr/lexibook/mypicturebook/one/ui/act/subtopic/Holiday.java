package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday.*;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

/**
 * Created by rain on 6/23/13.
 */
public class Holiday extends TopicBase {

    private GifMovieView sail;
    private GifMovieView cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday);

        sail = (GifMovieView) findViewById(R.id.gif_sailing);
        cloud = (GifMovieView) findViewById(R.id.gif_cloud);

        sail.setMovieAsset(getString(R.string.gif_holidays_sail));
        cloud.setMovieAsset(getString(R.string.gif_holidays_cloud));

        sub_locations = new int[][]{
                getResources().getIntArray(R.array.holiday_sea_location)
                , getResources().getIntArray(R.array.holiday_forest_location)
                , getResources().getIntArray(R.array.holiday_mountains_location)
                , getResources().getIntArray(R.array.holiday_farm_location)
                , getResources().getIntArray(R.array.holiday_desert_location)
        };
        sub_medias = new int[]{
                R.string.mp3_holiday_002, R.string.mp3_holiday_025, R.string.mp3_holiday_048
                , R.string.mp3_holiday_071, R.string.mp3_holiday_094
        };
        sub_clzz = new Class[]{
                Q49Sea.class, Q51Forest.class, Q53Mountains.class, Q55Farm.class, Q57Desert.class
        };
    }
}
