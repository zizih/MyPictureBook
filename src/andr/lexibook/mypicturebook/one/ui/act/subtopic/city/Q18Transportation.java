package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q18Transportation extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(18);
        setRight(5);
        setReLocation(7, 4, 10, 5, 6, 8, 2, 9, 1);
        setNextPage(Q19Transportation.class);
    }
}
