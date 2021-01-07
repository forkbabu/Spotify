package defpackage;

import android.content.Context;

/* renamed from: g45  reason: default package */
public final class g45 implements fjf<f45> {
    private final wlf<cqe> a;
    private final wlf<Context> b;

    public g45(wlf<cqe> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f45(this.a.get(), this.b.get());
    }
}
