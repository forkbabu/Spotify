package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: sb8  reason: default package */
public final class sb8 implements fjf<ib8> {
    private final wlf<sa8> a;
    private final wlf<q3> b;

    public sb8(wlf<sa8> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().c().b());
    }
}
