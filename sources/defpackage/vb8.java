package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: vb8  reason: default package */
public final class vb8 implements fjf<bc8> {
    private final wlf<q3> a;

    public vb8(wlf<q3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bc8(this.a.get().c().c().b().b().a());
    }
}
