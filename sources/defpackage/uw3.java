package defpackage;

import com.spotify.ubi.specification.factories.l;

/* renamed from: uw3  reason: default package */
public final class uw3 implements fjf<tw3> {
    private final wlf<ere> a;
    private final wlf<l> b;

    public uw3(wlf<ere> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tw3(this.a.get(), this.b.get());
    }
}
