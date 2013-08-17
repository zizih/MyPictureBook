package andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class MountainsQ54 extends HolidayBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(54);
        setRight(5);
        setAnimB(R.string.gif_anim_q54b);
        setAnimC(R.string.gif_anim_q54c);
        setAnimD(R.string.gif_anim_q54d);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}