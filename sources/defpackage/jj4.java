package defpackage;

import android.content.Context;

/* renamed from: jj4  reason: default package */
public final class jj4 implements fjf<ij4> {
    private final wlf<Context> a;
    private final wlf<dj4> b;

    public jj4(wlf<Context> wlf, wlf<dj4> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ij4(this.a.get(), this.b.get());
    }
}
