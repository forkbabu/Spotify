package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: mg4  reason: default package */
public final class mg4 implements fjf<lg4> {
    private final wlf<Activity> a;
    private final wlf<rg4> b;
    private final wlf<m> c;
    private final wlf<pb4> d;
    private final wlf<dc4> e;
    private final wlf<jg4> f;
    private final wlf<xf4> g;
    private final wlf<Boolean> h;

    public mg4(wlf<Activity> wlf, wlf<rg4> wlf2, wlf<m> wlf3, wlf<pb4> wlf4, wlf<dc4> wlf5, wlf<jg4> wlf6, wlf<xf4> wlf7, wlf<Boolean> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lg4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get().booleanValue());
    }
}
