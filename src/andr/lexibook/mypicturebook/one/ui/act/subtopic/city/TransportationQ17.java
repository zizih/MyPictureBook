package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class TransportationQ17 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(17);
        setAnimB(R.string.gif_anim_q17b);
        setRight(6);
        setReLocation(7, 4, 10, 5, 6, 8, 2, 9, 1);
        setNextPage(TransportationQ18.class);
    }
}
