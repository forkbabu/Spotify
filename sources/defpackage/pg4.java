package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import defpackage.og4;

/* renamed from: pg4  reason: default package */
public final class pg4 implements fjf<og4> {
    private final wlf<w51> a;
    private final wlf<m> b;
    private final wlf<Context> c;
    private final wlf<pb4> d;
    private final wlf<Boolean> e;
    private final wlf<jg4> f;
    private final wlf<og4.b> g;
    private final wlf<bg4> h;
    private final wlf<a64> i;

    public pg4(wlf<w51> wlf, wlf<m> wlf2, wlf<Context> wlf3, wlf<pb4> wlf4, wlf<Boolean> wlf5, wlf<jg4> wlf6, wlf<og4.b> wlf7, wlf<bg4> wlf8, wlf<a64> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new og4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
