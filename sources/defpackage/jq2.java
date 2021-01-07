package defpackage;

import com.spotify.ubi.specification.factories.e0;

/* renamed from: jq2  reason: default package */
public final class jq2 implements fjf<iq2> {
    private final wlf<ere> a;
    private final wlf<e0> b;

    public jq2(wlf<ere> wlf, wlf<e0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iq2(this.a.get(), this.b.get());
    }
}
