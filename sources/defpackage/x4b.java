package defpackage;

import io.reactivex.y;

/* renamed from: x4b  reason: default package */
public final class x4b implements fjf<w4b> {
    private final wlf<f7b> a;
    private final wlf<g3b> b;
    private final wlf<y> c;
    private final wlf<g6b> d;

    public x4b(wlf<f7b> wlf, wlf<g3b> wlf2, wlf<y> wlf3, wlf<g6b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w4b(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
