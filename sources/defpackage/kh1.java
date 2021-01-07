package defpackage;

import android.content.Context;

/* renamed from: kh1  reason: default package */
public final class kh1 implements fjf<jh1> {
    private final wlf<od1> a;
    private final wlf<ki1> b;
    private final wlf<Context> c;

    public kh1(wlf<od1> wlf, wlf<ki1> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jh1(this.a.get(), this.b.get(), this.c.get());
    }
}
