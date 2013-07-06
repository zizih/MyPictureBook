package andr.lexibook.mypicturebook.one.util;

import andr.lexibook.mypicturebook.one.model.Setting;
import android.app.Activity;
import android.content.Context;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: rain
 * Date: 5/9/13
 * Time: 8:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class SettingToFile implements ISerializeToFile<Setting> {

    private Activity ctx;
    private Setting cls;
    private FileOutputStream fo;
    private FileInputStream fi;

    public SettingToFile(Context ctx) {
        this.ctx = (Activity) ctx;
    }

    @Override
    public void save(Setting cls) {
        try {
            fo = ctx.openFileOutput("mypicture.setting",
                    Activity.MODE_PRIVATE);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(cls);
            oo.flush();
            fo.close();
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Setting get() {
        try {
            fi = ctx.openFileInput("mypicture.setting");
            ObjectInputStream oi = new ObjectInputStream(fi);
            cls = (Setting) oi.readObject();
            fi.close();
            oi.close();
            return cls;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Setting();
    }
}
