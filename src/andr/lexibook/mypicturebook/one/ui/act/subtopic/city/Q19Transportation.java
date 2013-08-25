package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q19Transportation extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(19);
        setRight(4);
        setReLocation(7, 4, 10, 5, 6, 8, 2, 9, 1);
        setNextPage(Q20Transportation.class);
    }
}
