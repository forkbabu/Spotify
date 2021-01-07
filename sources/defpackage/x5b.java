package defpackage;

import io.reactivex.z;

/* renamed from: x5b  reason: default package */
public class x5b implements w5b {
    private final sg0<hva, b91> a;
    private final vz0 b;

    public x5b(vz0 vz0, sg0<hva, b91> sg0) {
        this.b = vz0;
        this.a = sg0;
    }

    @Override // defpackage.w5b
    public z<b91> a(s7b s7b) {
        z<R> A = this.b.c(s7b.b()).A(new k5b(s7b));
        sg0<hva, b91> sg0 = this.a;
        sg0.getClass();
        return A.A(new n5b(sg0));
    }
}
