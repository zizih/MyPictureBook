package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday.Base;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BathroomQ06 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(6);
        setReLocation(7, 6, 9, 1, 4, 3, 10, 2, 5, 8);
        setNextPage(BathroomQ07.class);
    }
}
