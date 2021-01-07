package defpackage;

import java.util.Map;

/* renamed from: r7e  reason: default package */
public final class r7e implements fjf<q7e> {
    private final wlf<Map<Integer, l7e>> a;
    private final wlf<s7e> b;

    public r7e(wlf<Map<Integer, l7e>> wlf, wlf<s7e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q7e(this.a.get(), this.b.get());
    }
}
