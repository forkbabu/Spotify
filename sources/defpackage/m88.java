package defpackage;

import io.reactivex.g;

/* renamed from: m88  reason: default package */
public final class m88 implements fjf<g<y6b>> {
    private final wlf<t3b<y6b>> a;
    private final wlf<h5b> b;

    public m88(wlf<t3b<y6b>> wlf, wlf<h5b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<y6b> a2 = this.a.get().a(this.b.get());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
