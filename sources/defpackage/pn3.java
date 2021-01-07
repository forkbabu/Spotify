package defpackage;

import com.spotify.ubi.specification.factories.j;

/* renamed from: pn3  reason: default package */
public final class pn3 implements fjf<on3> {
    private final wlf<dv3> a;
    private final wlf<ere> b;
    private final wlf<j> c;

    public pn3(wlf<dv3> wlf, wlf<ere> wlf2, wlf<j> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new on3(this.a.get(), this.b.get(), this.c.get());
    }
}
