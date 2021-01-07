package defpackage;

import io.reactivex.y;

/* renamed from: z7a  reason: default package */
public final class z7a implements fjf<y7a> {
    private final wlf<f8a> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public z7a(wlf<f8a> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y7a(this.a.get(), this.b.get(), this.c.get());
    }
}
