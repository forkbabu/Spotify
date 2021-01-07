package defpackage;

import io.reactivex.y;

/* renamed from: m3b  reason: default package */
public final class m3b implements fjf<l3b> {
    private final wlf<g6b> a;
    private final wlf<n3b> b;
    private final wlf<y> c;

    public m3b(wlf<g6b> wlf, wlf<n3b> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l3b(this.a.get(), this.b.get(), this.c.get());
    }
}
