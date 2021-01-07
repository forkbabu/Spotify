package defpackage;

import android.content.Context;
import defpackage.sl8;

/* renamed from: wo8  reason: default package */
public final class wo8 implements fjf<vo8> {
    private final wlf<Context> a;
    private final wlf<sl8.a> b;
    private final wlf<rl8> c;

    public wo8(wlf<Context> wlf, wlf<sl8.a> wlf2, wlf<rl8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vo8(this.a.get(), this.b.get(), this.c.get());
    }
}
