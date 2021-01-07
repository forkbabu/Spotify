package defpackage;

import io.reactivex.y;

/* renamed from: xg5  reason: default package */
public final class xg5 implements fjf<wg5> {
    private final wlf<oh0> a;
    private final wlf<y> b;

    public xg5(wlf<oh0> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wg5(this.a.get(), this.b.get());
    }
}
