package andr.lexibook.mypicturebook.one.ui.act.subtopic.home;

import andr.lexibook.mypicturebook.one.R;
import android.os.Bundle;

/**
 * Created by rain on 7/3/13.
 */
public class Q03Kitchen extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setQIndex(2);
        setNextPage(Q04Kitchen.class);
        setHasNextQuestion();
    }

    @Override
    public void toQB() {
        super.toQB();
        setQSound(R.string.mp3_home_031);
    }
}
