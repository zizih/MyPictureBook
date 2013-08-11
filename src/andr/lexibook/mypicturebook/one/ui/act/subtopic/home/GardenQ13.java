package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class GardenQ13 extends SubBase {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(13);
        setRight(6);
        setReLocation(5, 3, 7, 6, 8, 4, 2, 9, 10, 1);
        setNextPage(GardenQ14.class);
    }
}
