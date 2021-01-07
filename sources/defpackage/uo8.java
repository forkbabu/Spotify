package defpackage;

import android.content.Context;
import defpackage.sl8;

/* renamed from: uo8  reason: default package */
public final class uo8 implements fjf<to8> {
    private final wlf<Context> a;
    private final wlf<sl8.a> b;
    private final wlf<rl8> c;

    public uo8(wlf<Context> wlf, wlf<sl8.a> wlf2, wlf<rl8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new to8(this.a.get(), this.b.get(), this.c.get());
    }
}
