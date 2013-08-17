package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class SchoolQ25 extends CityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(25);
        setRight(5);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        setNextPage(SchoolQ26.class);
    }
}
