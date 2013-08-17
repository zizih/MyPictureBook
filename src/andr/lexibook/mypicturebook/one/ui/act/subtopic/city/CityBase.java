package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.City;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 8/17/13.
 */
public class CityBase extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHome(City.class);
    }
}
