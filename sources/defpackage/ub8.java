package defpackage;

import com.spotify.ubi.specification.factories.q3;

/* renamed from: ub8  reason: default package */
public final class ub8 implements fjf<kb8> {
    private final wlf<xa8> a;
    private final wlf<q3> b;

    public ub8(wlf<xa8> wlf, wlf<q3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b(this.b.get().d().d().a());
    }
}
