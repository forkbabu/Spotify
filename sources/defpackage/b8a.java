package defpackage;

import io.reactivex.y;

/* renamed from: b8a  reason: default package */
public final class b8a implements fjf<a8a> {
    private final wlf<f8a> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public b8a(wlf<f8a> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a8a(this.a.get(), this.b.get(), this.c.get());
    }
}
