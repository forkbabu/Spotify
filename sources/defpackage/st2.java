package defpackage;

import android.app.Activity;
import android.content.res.Resources;

/* renamed from: st2  reason: default package */
public final class st2 implements fjf<Resources> {
    private final wlf<Activity> a;

    public st2(wlf<Activity> wlf) {
        this.a = wlf;
    }

    public static Resources a(Activity activity) {
        Resources resources = activity.getResources();
        yif.g(resources, "Cannot return null from a non-@Nullable @Provides method");
        return resources;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
