package defpackage;

import com.spotify.ubi.specification.factories.e0;

/* renamed from: gp2  reason: default package */
public final class gp2 implements fjf<fp2> {
    private final wlf<ere> a;
    private final wlf<e0> b;

    public gp2(wlf<ere> wlf, wlf<e0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fp2(this.a.get(), this.b.get());
    }
}
