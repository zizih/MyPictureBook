package andr.lexibook.mypicturebook.one.ui.act.quiz;

import andr.lexibook.mypicturebook.one.ui.act.BaseActivity;
import andr.lexibook.mypicturebook.one.util.RandomUtil;
import android.os.Bundle;

/**
 * Created by rain on 8/11/13.
 */
public class Quiz extends BaseActivity {

    private int[][] order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        order = RandomUtil.getInstance().getQuestionOrder();
    }
}

