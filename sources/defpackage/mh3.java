package defpackage;

import defpackage.lh3;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: mh3  reason: default package */
public final class mh3 implements fjf<lh3.a> {
    private final wlf<s<Boolean>> a;
    private final wlf<nh3> b;
    private final wlf<y> c;

    public mh3(wlf<s<Boolean>> wlf, wlf<nh3> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lh3.a(this.a.get(), this.b.get(), this.c.get());
    }
}
