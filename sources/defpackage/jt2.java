package defpackage;

import android.app.Service;
import kotlin.jvm.internal.h;

/* renamed from: jt2  reason: default package */
public final class jt2 implements fjf<String> {
    private final wlf<Service> a;

    public jt2(wlf<Service> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Service service = this.a.get();
        h.e(service, "service");
        String simpleName = service.getClass().getSimpleName();
        h.d(simpleName, "service.javaClass.simpleName");
        return simpleName;
    }
}
