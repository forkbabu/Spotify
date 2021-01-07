package defpackage;

import io.reactivex.y;

/* renamed from: yr5  reason: default package */
public final class yr5 implements fjf<xr5> {
    private final wlf<y> a;
    private final wlf<y> b;

    public yr5(wlf<y> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xr5(this.a.get(), this.b.get());
    }
}
