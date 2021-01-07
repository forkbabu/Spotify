package defpackage;

import org.threeten.bp.Clock;
import org.threeten.bp.format.b;

/* renamed from: xy0  reason: default package */
public final class xy0 implements fjf<xx0> {
    private final wlf<cqe> a;

    public xy0(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xx0(Clock.d(), b.k, this.a.get().f());
    }
}
