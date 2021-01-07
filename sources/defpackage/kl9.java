package defpackage;

import android.content.Context;

/* renamed from: kl9  reason: default package */
public final class kl9 implements fjf<jl9> {
    private final wlf<Context> a;
    private final wlf<yec> b;
    private final wlf<uk9> c;

    public kl9(wlf<Context> wlf, wlf<yec> wlf2, wlf<uk9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jl9(this.a.get(), this.b.get(), this.c.get());
    }
}
