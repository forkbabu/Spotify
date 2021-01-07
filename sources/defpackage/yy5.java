package defpackage;

import android.content.Context;
import defpackage.qy5;

/* renamed from: yy5  reason: default package */
public final class yy5 implements fjf<xy5> {
    private final wlf<qy5.a> a;
    private final wlf<Context> b;

    public yy5(wlf<qy5.a> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xy5(this.a.get(), this.b.get());
    }
}
