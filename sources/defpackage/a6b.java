package defpackage;

import io.reactivex.z;

/* renamed from: a6b  reason: default package */
public class a6b implements z5b {
    private final vz0 a;
    private final sg0<gva, b91> b;

    public a6b(vz0 vz0, sg0<gva, b91> sg0) {
        this.a = vz0;
        this.b = sg0;
    }

    @Override // defpackage.z5b
    public z<b91> a(String str, s7b s7b) {
        z<R> A = this.a.b(str, s7b.b()).A(new l5b(s7b, str));
        sg0<gva, b91> sg0 = this.b;
        sg0.getClass();
        return A.A(new v5b(sg0));
    }
}
