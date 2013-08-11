package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.ui.act.subtopic.SubBase;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class GardenQ14 extends SubBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(14);
        setRight(4);
        setReLocation(10, 7, 4, 6, 1, 2, 5, 8, 3, 9);
        setHasNextQuestion();
        setNextPage(GardenQ15.class);
    }

    @Override
    public void toQB() {
        super.toQB();
        setQSound(R.string.mp3_home_155);
    }
}
