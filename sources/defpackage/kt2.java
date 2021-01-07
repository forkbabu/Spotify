package defpackage;

import android.app.Service;
import android.content.res.Resources;
import kotlin.jvm.internal.h;

/* renamed from: kt2  reason: default package */
public final class kt2 implements fjf<Resources> {
    private final wlf<Service> a;

    public kt2(wlf<Service> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Service service = this.a.get();
        h.e(service, "service");
        Resources resources = service.getResources();
        h.d(resources, "service.resources");
        return resources;
    }
}
