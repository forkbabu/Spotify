package defpackage;

import android.app.Activity;
import defpackage.sba;

/* renamed from: wl4  reason: default package */
public class wl4 implements uba {
    private final Activity a;
    private final sba.a b;

    public wl4(Activity activity, sba.a aVar) {
        activity.getClass();
        this.a = activity;
        this.b = aVar;
    }

    @Override // defpackage.uba
    public void b() {
        Activity activity = this.a;
        activity.startActivity(this.b.a(activity));
    }
}
