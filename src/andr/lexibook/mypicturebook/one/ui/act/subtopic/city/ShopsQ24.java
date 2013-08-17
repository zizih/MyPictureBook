package andr.lexibook.mypicturebook.one.ui.act.subtopic.city;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class ShopsQ24 extends CityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(24);
        setRight(6);
        setAnimB(R.string.gif_anim_q24b);
        setReLocation(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
