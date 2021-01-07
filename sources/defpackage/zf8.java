package defpackage;

import android.content.Context;

/* renamed from: zf8  reason: default package */
public final class zf8 implements fjf<yf8> {
    private final wlf<Context> a;
    private final wlf<z58> b;
    private final wlf<Boolean> c;

    public zf8(wlf<Context> wlf, wlf<z58> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yf8(this.a.get(), this.b.get(), this.c.get().booleanValue());
    }
}
