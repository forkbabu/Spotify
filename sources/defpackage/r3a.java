package defpackage;

import io.reactivex.y;

/* renamed from: r3a  reason: default package */
public final class r3a implements fjf<q3a> {
    private final wlf<z70> a;
    private final wlf<m3a> b;
    private final wlf<y> c;

    public r3a(wlf<z70> wlf, wlf<m3a> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q3a(this.a.get(), this.b.get(), this.c.get());
    }
}
