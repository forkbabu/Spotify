package defpackage;

import defpackage.o1e;
import io.reactivex.y;

/* renamed from: kp5  reason: default package */
public final class kp5 implements fjf<o1e<b91>> {
    private final wlf<y> a;
    private final wlf<to5> b;

    public kp5(wlf<y> wlf, wlf<to5> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o1e.b(this.b.get().b(), this.a.get()).a();
    }
}
