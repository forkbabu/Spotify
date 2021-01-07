package defpackage;

import java.util.Map;

/* renamed from: k1d  reason: default package */
public final class k1d implements fjf<j1d> {
    private final wlf<w1d> a;
    private final wlf<l1d> b;
    private final wlf<n1d> c;
    private final wlf<Map<Integer, p1d>> d;

    public k1d(wlf<w1d> wlf, wlf<l1d> wlf2, wlf<n1d> wlf3, wlf<Map<Integer, p1d>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j1d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
