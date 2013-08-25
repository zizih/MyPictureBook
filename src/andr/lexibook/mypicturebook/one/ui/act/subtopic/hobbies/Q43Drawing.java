package andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies;

import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class Q43Drawing extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(43);
        setRight(5);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(Q44Drawing.class);
    }
}