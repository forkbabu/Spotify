package defpackage;

import com.spotify.ubi.specification.factories.e0;

/* renamed from: up2  reason: default package */
public final class up2 implements fjf<tp2> {
    private final wlf<ere> a;
    private final wlf<e0> b;

    public up2(wlf<ere> wlf, wlf<e0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tp2(this.a.get(), this.b.get());
    }
}
