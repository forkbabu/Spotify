package defpackage;

import com.spotify.ubi.specification.factories.l4;

/* renamed from: gz8  reason: default package */
public final class gz8 implements fjf<fz8> {
    private final wlf<ere> a;
    private final wlf<l4> b;

    public gz8(wlf<ere> wlf, wlf<l4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fz8(this.a.get(), this.b.get());
    }
}
