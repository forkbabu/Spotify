package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: qb8  reason: default package */
public final class qb8 implements fjf<fb8> {
    private final wlf<ka8> a;
    private final wlf<q3> b;

    public qb8(wlf<ka8> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().b().a());
    }
}
