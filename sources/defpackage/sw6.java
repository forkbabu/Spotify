package defpackage;

import io.reactivex.y;

/* renamed from: sw6  reason: default package */
public final class sw6 implements fjf<rw6> {
    private final wlf<wt6> a;
    private final wlf<y> b;
    private final wlf<oy6> c;

    public sw6(wlf<wt6> wlf, wlf<y> wlf2, wlf<oy6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rw6(this.a.get(), this.b.get(), this.c.get());
    }
}
