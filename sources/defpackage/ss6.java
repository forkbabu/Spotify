package defpackage;

import io.reactivex.y;

/* renamed from: ss6  reason: default package */
public final class ss6 implements fjf<rs6> {
    private final wlf<y> a;

    public ss6(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rs6(this.a.get());
    }
}
