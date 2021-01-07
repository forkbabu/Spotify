package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: rb8  reason: default package */
public final class rb8 implements fjf<gb8> {
    private final wlf<na8> a;
    private final wlf<q3> b;

    public rb8(wlf<na8> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().c());
    }
}
