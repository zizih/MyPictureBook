package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q09Bedroom extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(9);
        setRight(4);
        setReLocation(1,8,2,7,6,3,4,9,10,5);
        setNextPage(Q10Bedroom.class);
    }
}