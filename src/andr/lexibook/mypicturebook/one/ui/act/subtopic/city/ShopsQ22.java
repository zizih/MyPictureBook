package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class ShopsQ22 extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(22);
        setRight(5);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(ShopsQ23.class);
    }
}
