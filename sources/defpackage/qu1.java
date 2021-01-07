package defpackage;

import io.reactivex.y;

/* renamed from: qu1  reason: default package */
public final class qu1 implements fjf<pu1> {
    private final wlf<yn1> a;
    private final wlf<y> b;

    public qu1(wlf<yn1> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pu1(this.a.get(), this.b.get());
    }
}
