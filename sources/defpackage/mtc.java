package defpackage;

import com.spotify.ubi.specification.factories.v2;

/* renamed from: mtc  reason: default package */
public final class mtc implements fjf<ltc> {
    private final wlf<ere> a;
    private final wlf<v2> b;
    private final wlf<String> c;

    public mtc(wlf<ere> wlf, wlf<v2> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ltc(this.a.get(), this.b.get(), this.c.get());
    }
}
