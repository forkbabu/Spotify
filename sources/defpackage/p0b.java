package defpackage;

import io.reactivex.y;

/* renamed from: p0b  reason: default package */
public final class p0b implements fjf<o0b> {
    private final wlf<lz0> a;
    private final wlf<y> b;

    public p0b(wlf<lz0> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o0b(this.a.get(), this.b.get());
    }
}
