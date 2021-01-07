package defpackage;

import defpackage.o1e;
import io.reactivex.y;

/* renamed from: gb4  reason: default package */
public final class gb4 implements fjf<o1e<b91>> {
    private final wlf<y> a;
    private final wlf<b91> b;

    public gb4(wlf<y> wlf, wlf<b91> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o1e.b(this.b.get(), this.a.get()).a();
    }
}
