package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class TransportationQ19 extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(19);
        setRight(4);
        setReLocation(7, 4, 10, 5, 6, 8, 2, 9, 1);
        setNextPage(TransportationQ20.class);
    }
}