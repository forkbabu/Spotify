package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: ca8  reason: default package */
public final class ca8 implements fjf<gb8> {
    private final wlf<z98> a;
    private final wlf<v> b;

    public ca8(wlf<z98> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().c());
    }
}
