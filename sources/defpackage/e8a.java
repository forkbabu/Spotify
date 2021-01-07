package defpackage;

import io.reactivex.y;

/* renamed from: e8a  reason: default package */
public final class e8a implements fjf<d8a> {
    private final wlf<f8a> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public e8a(wlf<f8a> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d8a(this.a, this.b, this.c);
    }
}
