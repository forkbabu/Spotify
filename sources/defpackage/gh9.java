package defpackage;

import com.spotify.ubi.specification.factories.u4;

/* renamed from: gh9  reason: default package */
public final class gh9 implements fjf<fh9> {
    private final wlf<ere> a;
    private final wlf<u4> b;

    public gh9(wlf<ere> wlf, wlf<u4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fh9(this.a.get(), this.b.get());
    }
}
