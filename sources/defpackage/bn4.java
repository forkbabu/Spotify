package defpackage;

import io.reactivex.y;

/* renamed from: bn4  reason: default package */
public final class bn4 implements fjf<an4> {
    private final wlf<y> a;
    private final wlf<cn4> b;

    public bn4(wlf<y> wlf, wlf<cn4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new an4(this.a.get(), this.b.get());
    }
}
