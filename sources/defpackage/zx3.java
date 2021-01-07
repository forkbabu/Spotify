package defpackage;

import io.reactivex.y;

/* renamed from: zx3  reason: default package */
public final class zx3 implements fjf<yx3> {
    private final wlf<y> a;
    private final wlf<String> b;
    private final wlf<ly3> c;

    public zx3(wlf<y> wlf, wlf<String> wlf2, wlf<ly3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yx3(this.a.get(), this.b.get(), this.c.get());
    }
}
