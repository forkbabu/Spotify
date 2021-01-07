package defpackage;

import com.spotify.ubi.specification.factories.n1;

/* renamed from: e28  reason: default package */
public final class e28 implements fjf<d28> {
    private final wlf<ere> a;
    private final wlf<n1> b;

    public e28(wlf<ere> wlf, wlf<n1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d28(this.a.get(), this.b.get());
    }
}
