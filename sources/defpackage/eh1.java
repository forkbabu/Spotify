package defpackage;

import com.spotify.mobile.android.service.media.browser.m;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.t;
import com.spotify.remoteconfig.x4;

/* renamed from: eh1  reason: default package */
public final class eh1 implements fjf<dh1> {
    private final wlf<vj1> a;
    private final wlf<lj1> b;
    private final wlf<x4> c;
    private final wlf<t> d;
    private final wlf<aqe> e;
    private final wlf<m> f;
    private final wlf<vxd> g;
    private final wlf<o> h;

    public eh1(wlf<vj1> wlf, wlf<lj1> wlf2, wlf<x4> wlf3, wlf<t> wlf4, wlf<aqe> wlf5, wlf<m> wlf6, wlf<vxd> wlf7, wlf<o> wlf8) {
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
        return new dh1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
