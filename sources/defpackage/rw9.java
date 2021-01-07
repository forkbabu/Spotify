package defpackage;

import java.util.Random;

/* renamed from: rw9  reason: default package */
public final class rw9 implements fjf<qw9> {
    private final wlf<Random> a;
    private final wlf<cqe> b;

    public rw9(wlf<Random> wlf, wlf<cqe> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qw9(this.a.get(), this.b.get());
    }
}
