package defpackage;

import io.reactivex.y;

/* renamed from: tg5  reason: default package */
public final class tg5 implements fjf<sg5> {
    private final wlf<s9a> a;
    private final wlf<y> b;

    public tg5(wlf<s9a> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sg5(this.a.get(), this.b.get());
    }
}
