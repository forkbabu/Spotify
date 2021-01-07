package defpackage;

import com.spotify.ubi.specification.factories.t4;

/* renamed from: glc  reason: default package */
public final class glc implements fjf<flc> {
    private final wlf<ere> a;
    private final wlf<t4> b;

    public glc(wlf<ere> wlf, wlf<t4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new flc(this.a.get(), this.b.get());
    }
}
