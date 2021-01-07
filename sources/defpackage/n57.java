package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: n57  reason: default package */
public final class n57 implements fjf<m57> {
    private final wlf<ere> a;
    private final wlf<q2> b;

    public n57(wlf<ere> wlf, wlf<q2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m57(this.a.get(), this.b.get());
    }
}
