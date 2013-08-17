package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class JobsQ30 extends CityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(30);
        setRight(5);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(JobsQ31.class);
    }
}
