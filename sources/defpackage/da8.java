package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: da8  reason: default package */
public final class da8 implements fjf<ib8> {
    private final wlf<sa8> a;
    private final wlf<v> b;

    public da8(wlf<sa8> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().c().b());
    }
}
