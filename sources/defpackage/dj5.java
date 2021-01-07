package defpackage;

import com.spotify.ubi.specification.factories.g1;

/* renamed from: dj5  reason: default package */
public final class dj5 implements fjf<cj5> {
    private final wlf<ere> a;
    private final wlf<g1> b;

    public dj5(wlf<ere> wlf, wlf<g1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cj5(this.a.get(), this.b.get());
    }
}
