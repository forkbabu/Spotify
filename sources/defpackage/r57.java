package defpackage;

import com.spotify.ubi.specification.factories.q2;

/* renamed from: r57  reason: default package */
public final class r57 implements fjf<q57> {
    private final wlf<ere> a;
    private final wlf<q2> b;
    private final wlf<String> c;

    public r57(wlf<ere> wlf, wlf<q2> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q57(this.a.get(), this.b.get(), this.c.get());
    }
}
