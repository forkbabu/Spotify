package defpackage;

import io.reactivex.y;

/* renamed from: p17  reason: default package */
public final class p17 implements fjf<o17> {
    private final wlf<q17> a;
    private final wlf<String> b;
    private final wlf<y> c;

    public p17(wlf<q17> wlf, wlf<String> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o17(this.a.get(), this.b.get(), this.c.get());
    }
}
