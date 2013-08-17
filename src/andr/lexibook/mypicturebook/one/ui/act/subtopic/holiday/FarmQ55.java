package andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday;

import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class FarmQ55 extends HolidayBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(55);
        setRight(5);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(FarmQ56.class);
    }
}