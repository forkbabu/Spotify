package defpackage;

import android.app.Activity;
import android.os.Build;

/* renamed from: ul5  reason: default package */
public class ul5 {
    private final Activity a;
    private final w52 b;
    private final wl5 c;

    public ul5(Activity activity, w52 w52, wl5 wl5) {
        this.a = activity;
        this.b = w52;
        this.c = wl5;
    }

    public void a(String... strArr) {
        this.b.c(this.a, strArr);
    }

    public boolean b(String str) {
        ((xl5) this.c).getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            return !this.b.f(this.a, str);
        }
        return false;
    }
}
