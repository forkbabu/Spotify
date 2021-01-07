package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: r70  reason: default package */
public class r70 {
    private final ActivityManager a;
    private final v70 b;
    private final t70 c;

    public r70(ActivityManager activityManager, v70 v70, t70 t70) {
        this.a = activityManager;
        this.b = v70;
        this.c = t70;
    }

    public void a() {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        if (this.a.isBackgroundRestricted()) {
            this.b.a();
            this.c.d();
            return;
        }
        this.c.c();
    }
}
