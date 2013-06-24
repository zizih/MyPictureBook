package andr.lexibook.mypicturebook.one.ui.act;

import andr.lexibook.mypicturebook.one.R;
import andr.lexibook.mypicturebook.one.util.ViewUtil;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by rain on 6/22/13.
 */
@SuppressWarnings("deprecation")
public class BaseActivity extends Activity {

    private AnimationDrawable ad;
    private Intent toPage;
    private MenuInflater inflater;
    public AbsoluteLayout.LayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toPage = new Intent();
        inflater = getMenuInflater();
    }

    public void toPage(Class<?> cls) {
        toPage.setClass(this, cls);
        startActivity(toPage);
        this.finish();
        System.gc();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        inflater.inflate(R.menu.language, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "not support!", 1000).show();
        return true;
    }

    public float getWidthScale() {
        return ViewUtil.getInstance(this).getWidthScale();
    }

    public float getHeightScale() {
        return ViewUtil.getInstance(this).getHeightScale();
    }

    public float getDimens(int dimensId) {
        return getResources().getDimension(dimensId);
    }

    public boolean checkLocation(MotionEvent event, int[] location) {
        if (event.getX() > location[0] * getWidthScale()
                && event.getY() > location[1] * getHeightScale()
                && event.getX() < location[2] * getWidthScale()
                && event.getY() < location[3] * getHeightScale()) {
            return true;
        }
        return false;
    }

    protected void animStart(ImageView iv) {
        System.out.println(iv.getId());
        System.out.println(iv.getBackground());
        ad = (AnimationDrawable) iv.getBackground();
        ad.stop();
        ad.start();
    }
}
