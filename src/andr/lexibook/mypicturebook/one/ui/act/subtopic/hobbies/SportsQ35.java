package andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class SportsQ35 extends HobbiesBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(35);
        setRight(5);
        setAnimB(R.string.gif_anim_q35b);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(SportsQ36.class);
    }
}