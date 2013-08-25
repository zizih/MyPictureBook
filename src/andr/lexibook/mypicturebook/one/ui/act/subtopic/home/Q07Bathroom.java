package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q07Bathroom extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(6);
        setReLocation(1, 9, 7, 3, 6, 10, 2, 4, 8);
        setNextPage(Q08Bathroom.class);
    }
}
