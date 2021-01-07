package defpackage;

import java.util.Map;

/* renamed from: d0d  reason: default package */
public final class d0d implements fjf<c0d> {
    private final wlf<Map<Integer, p1d>> a;
    private final wlf<Map<Integer, w9e>> b;
    private final wlf<w1d> c;

    public d0d(wlf<Map<Integer, p1d>> wlf, wlf<Map<Integer, w9e>> wlf2, wlf<w1d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static c0d a(Map<Integer, p1d> map, Map<Integer, w9e> map2, w1d w1d) {
        return new c0d(map, map2, w1d);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0d(this.a.get(), this.b.get(), this.c.get());
    }
}
