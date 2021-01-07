package defpackage;

import io.reactivex.y;

/* renamed from: ym4  reason: default package */
public final class ym4 implements fjf<um4> {
    private final wlf<zm4> a;
    private final wlf<y> b;

    public ym4(wlf<zm4> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new um4(this.a.get(), this.b.get());
    }
}
