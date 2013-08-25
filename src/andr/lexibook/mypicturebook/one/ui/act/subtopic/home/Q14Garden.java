package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q14Garden extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(14);
        setRight(4);
        setReLocation(10, 7, 4, 6, 1, 2, 5, 8, 3, 9);
        setHasNextQuestion();
        setNextPage(Q15Garden.class);
    }

    @Override
    public void toQB() {
        super.toQB();
        setQSound(R.string.mp3_home_155);
    }
}