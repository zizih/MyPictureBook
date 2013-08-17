package andr.lexibook.mypicturebook.one.ui.act.subtopic.hobbies;

import andr.lexibook.mypicturebook.one.ui.act.subtopic.Hobbies;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 8/17/13.
 */
public class HobbiesBase extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHome(Hobbies.class);
    }
}
