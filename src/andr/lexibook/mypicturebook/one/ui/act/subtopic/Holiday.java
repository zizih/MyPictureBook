package andr.lexibook.mypicturebook.one.ui.act.subtopic;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

/**
 * Created by rain on 6/23/13.
 */
public class Holiday extends SubBase {

    private GifMovieView sail;
    private GifMovieView cloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday);

        sail = (GifMovieView) findViewById(R.id.gif_sailing);
        cloud = (GifMovieView) findViewById(R.id.gif_cloud);

        sail.setMovieAsset(getString(R.string.fra_holidays_sail));
        cloud.setMovieAsset(getString(R.string.fra_holidays_cloud));
    }
}
