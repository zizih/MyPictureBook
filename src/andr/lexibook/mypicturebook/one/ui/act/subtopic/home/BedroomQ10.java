package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BedroomQ10 extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(10);
        setRight(3);
        setReLocation(6, 1, 3, 5, 2, 10, 9, 8, 4, 7);
        setNextPage(BedroomQ11.class);
    }
}
