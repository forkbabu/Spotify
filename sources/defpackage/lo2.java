package defpackage;

import io.reactivex.s;

/* renamed from: lo2  reason: default package */
public final class lo2 implements fjf<ko2> {
    private final wlf<s<d7a>> a;
    private final wlf<ep2> b;

    public lo2(wlf<s<d7a>> wlf, wlf<ep2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ko2(this.a.get(), this.b.get());
    }
}
