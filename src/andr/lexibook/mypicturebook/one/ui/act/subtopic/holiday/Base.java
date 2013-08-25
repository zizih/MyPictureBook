package andr.lexibook.mypicturebook.one.ui.act.subtopic.holiday;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.Holiday;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 8/17/13.
 */
public class Base extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHome(Holiday.class);
    }
}
