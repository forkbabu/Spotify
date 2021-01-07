package defpackage;

import java.util.Map;

/* renamed from: h3e  reason: default package */
public final class h3e implements fjf<g3e> {
    private final wlf<Map<Integer, x2e>> a;
    private final wlf<k3e> b;

    public h3e(wlf<Map<Integer, x2e>> wlf, wlf<k3e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g3e(this.a.get(), this.b.get());
    }
}
