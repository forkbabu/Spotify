package defpackage;

import io.reactivex.y;

/* renamed from: l75  reason: default package */
public final class l75 implements fjf<k75> {
    private final wlf<g75> a;
    private final wlf<b61> b;
    private final wlf<String> c;
    private final wlf<String> d;
    private final wlf<y> e;

    public l75(wlf<g75> wlf, wlf<b61> wlf2, wlf<String> wlf3, wlf<String> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k75(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
