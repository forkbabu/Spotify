package defpackage;

import io.reactivex.y;

/* renamed from: r7d  reason: default package */
public final class r7d implements fjf<q7d> {
    private final wlf<y> a;

    public r7d(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q7d(this.a.get());
    }
}
