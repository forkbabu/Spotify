package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: l57  reason: default package */
public final class l57 implements fjf<k57> {
    private final wlf<ere> a;
    private final wlf<q2> b;

    public l57(wlf<ere> wlf, wlf<q2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k57(this.a.get(), this.b.get());
    }
}
