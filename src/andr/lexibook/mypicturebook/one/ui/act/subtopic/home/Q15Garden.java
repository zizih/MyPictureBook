package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q15Garden extends Base {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(15);
        setReLocation(1, 4, 9, 5, 7, 6, 10, 3, 8, 2);
        setNextPage(Q16Garden.class);
    }
}
