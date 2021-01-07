package defpackage;

import io.reactivex.y;

/* renamed from: l4b  reason: default package */
public final class l4b implements fjf<k4b> {
    private final wlf<k8b> a;
    private final wlf<y> b;

    public l4b(wlf<k8b> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k4b(this.a.get(), this.b.get());
    }
}
