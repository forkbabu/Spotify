package defpackage;

import io.reactivex.g;
import io.reactivex.y;

/* renamed from: bi2  reason: default package */
public final class bi2 implements fjf<ai2> {
    private final wlf<y> a;
    private final wlf<g<k9f>> b;

    public bi2(wlf<y> wlf, wlf<g<k9f>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ai2(this.a.get(), this.b.get());
    }
}
