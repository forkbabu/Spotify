package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: f00  reason: default package */
public class f00 {
    private final Context a;

    public f00(Context context) {
        this.a = context;
    }

    public File a() {
        File file = new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        ty.f().h("Couldn't create file");
        return null;
    }

    public String b() {
        return new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }
}
