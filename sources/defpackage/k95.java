package defpackage;

import com.spotify.ubi.specification.factories.s0;

/* renamed from: k95  reason: default package */
public final class k95 implements fjf<j95> {
    private final wlf<ere> a;
    private final wlf<s0> b;

    public k95(wlf<ere> wlf, wlf<s0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j95(this.a.get(), this.b.get());
    }
}
