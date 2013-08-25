package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q27School extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(27);
        setRight(8);
        setAnimB(R.string.gif_anim_q27b);
        setAnimC(R.string.gif_anim_q27c);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(Q28School.class);
    }
}
