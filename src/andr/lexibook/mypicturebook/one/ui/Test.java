package andr.lexibook.mypicturebook.one.ui;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by rain on 6/22/13.
 */
public class Test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GifMovieView gv = new GifMovieView(this);
        gv.setMovieAsset(getString(R.string.gif_mode_discovery));
        LinearLayout layout = new LinearLayout(this);
        layout.addView(gv);
        setContentView(layout);
    }
}
