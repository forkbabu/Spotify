package defpackage;

import defpackage.o1e;
import io.reactivex.y;

/* renamed from: u78  reason: default package */
public final class u78 implements fjf<o1e<b91>> {
    private final wlf<yf8> a;
    private final wlf<y> b;

    public u78(wlf<yf8> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o1e.b(this.a.get().e(), this.b.get()).a();
    }
}
