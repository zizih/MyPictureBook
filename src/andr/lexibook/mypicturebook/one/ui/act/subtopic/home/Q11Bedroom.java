package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q11Bedroom extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(11);
        setRight(6);
        setReLocation(6, 5, 8, 9, 7, 1, 4, 2, 3, 10);
        setNextPage(Q12Bedroom.class);
    }
}