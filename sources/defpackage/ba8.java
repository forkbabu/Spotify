package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: ba8  reason: default package */
public final class ba8 implements fjf<fb8> {
    private final wlf<ka8> a;
    private final wlf<v> b;

    public ba8(wlf<ka8> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().b().a());
    }
}
