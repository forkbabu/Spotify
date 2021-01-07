package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: b67  reason: default package */
public final class b67 implements fjf<a67> {
    private final wlf<ere> a;
    private final wlf<q2> b;

    public b67(wlf<ere> wlf, wlf<q2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a67(this.a.get(), this.b.get());
    }
}
