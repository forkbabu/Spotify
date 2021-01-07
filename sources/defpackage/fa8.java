package defpackage;

import com.spotify.ubi.specification.factories.v;

/* renamed from: fa8  reason: default package */
public final class fa8 implements fjf<kb8> {
    private final wlf<xa8> a;
    private final wlf<v> b;

    public fa8(wlf<xa8> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().d().a());
    }
}
