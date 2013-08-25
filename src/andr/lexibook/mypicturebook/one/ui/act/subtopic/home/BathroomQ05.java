package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class BathroomQ05 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(5);
        setRight(4);
        setNextPage(BathroomQ06.class);
    }
}
