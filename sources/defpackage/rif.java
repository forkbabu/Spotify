package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import defpackage.pif;
import kotlin.jvm.internal.h;

/* renamed from: rif  reason: default package */
public final class rif implements fjf<Resources> {
    private final wlf<Activity> a;

    public rif(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        pif.a aVar = pif.a;
        h.e(activity, "activity");
        Resources resources = activity.getResources();
        h.d(resources, "activity.resources");
        return resources;
    }
}
