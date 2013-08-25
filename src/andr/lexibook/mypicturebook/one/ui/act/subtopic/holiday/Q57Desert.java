package andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class Q57Desert extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(57);
        setRight(4);
        setAnimB(R.string.gif_anim_q57b);
        setAnimC(R.string.gif_anim_q57c);
        setNextPage(Q58Desert.class);
    }
}