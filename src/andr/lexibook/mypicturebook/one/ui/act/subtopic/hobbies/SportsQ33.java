package andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class SportsQ33 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(33);
        setRight(5);
        setAnimB(R.string.gif_anim_q33b);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(SportsQ34.class);
    }
}