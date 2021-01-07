package defpackage;

import com.spotify.http.u;

/* renamed from: cy0  reason: default package */
public final class cy0 implements fjf<by0> {
    private final wlf<u> a;
    private final wlf<ux0> b;
    private final wlf<ox0> c;

    public cy0(wlf<u> wlf, wlf<ux0> wlf2, wlf<ox0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new by0(this.a.get(), this.b.get(), this.c.get());
    }
}
