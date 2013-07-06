package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.viewIml.GifMovieView;
import android.os.Bundle;

public class Help extends BaseActivity {

    private GifMovieView help;

    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        help = (GifMovieView) findViewById(R.id.gif_mode_help);
        help.setMovieAsset(getString(R.string.fra_help));
    }

    @Override
    public void toPage(Class<?> cls) {
        super.toPage(cls);
        finish();
    }

}
