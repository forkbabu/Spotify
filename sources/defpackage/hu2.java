package defpackage;

import android.app.Application;

/* renamed from: hu2  reason: default package */
public final class hu2 implements fjf<e6> {
    private final wlf<Application> a;

    public hu2(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e6 b = e6.b(this.a.get());
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
