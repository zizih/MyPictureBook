package andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class Q53Mountains extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(53);
        setRight(6);
        setAnimB(R.string.gif_anim_q53b);
        setAnimC(R.string.gif_anim_q53c);
        setAnimD(R.string.gif_anim_q53d);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(Q54Mountains.class);
    }
}