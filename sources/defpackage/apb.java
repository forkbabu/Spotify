package defpackage;

import io.reactivex.y;

/* renamed from: apb  reason: default package */
public final class apb implements fjf<zob> {
    private final wlf<xr3> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public apb(wlf<xr3> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zob(this.a.get(), this.b.get(), this.c.get());
    }
}
