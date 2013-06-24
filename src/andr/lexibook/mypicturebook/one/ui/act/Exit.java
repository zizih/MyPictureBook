package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

public class Exit extends BaseActivity {

    private GifMovieView bee;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exit);

        bee = (GifMovieView) findViewById(R.id.gif_exit_bee);
        bee.setMovieAsset(getString(R.string.gif_exit_bee));
    }

}
