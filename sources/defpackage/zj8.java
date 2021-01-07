package defpackage;

import android.content.Context;

/* renamed from: zj8  reason: default package */
public final class zj8 implements fjf<yj8> {
    private final wlf<Context> a;
    private final wlf<jz1> b;
    private final wlf<cqe> c;
    private final wlf<nsb> d;

    public zj8(wlf<Context> wlf, wlf<jz1> wlf2, wlf<cqe> wlf3, wlf<nsb> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yj8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
