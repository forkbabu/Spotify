package defpackage;

import android.util.DisplayMetrics;
import com.spotify.mobile.android.util.t;
import com.spotify.music.spotlets.tracker.identifier.a;
import defpackage.px0;

/* renamed from: sx0  reason: default package */
public final class sx0 implements fjf<px0> {
    private final wlf<String> a;
    private final wlf<a> b;
    private final wlf<t> c;
    private final wlf<DisplayMetrics> d;
    private final wlf<px0.b> e;
    private final wlf<px0.a> f;
    private final wlf<wx0> g;
    private final wlf<yx0> h;

    public sx0(wlf<String> wlf, wlf<a> wlf2, wlf<t> wlf3, wlf<DisplayMetrics> wlf4, wlf<px0.b> wlf5, wlf<px0.a> wlf6, wlf<wx0> wlf7, wlf<yx0> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static sx0 a(wlf<String> wlf, wlf<a> wlf2, wlf<t> wlf3, wlf<DisplayMetrics> wlf4, wlf<px0.b> wlf5, wlf<px0.a> wlf6, wlf<wx0> wlf7, wlf<yx0> wlf8) {
        return new sx0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new px0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
