package defpackage;

import io.reactivex.y;

/* renamed from: in7  reason: default package */
public final class in7 implements fjf<hn7> {
    private final wlf<y> a;

    public in7(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hn7(this.a.get());
    }
}
