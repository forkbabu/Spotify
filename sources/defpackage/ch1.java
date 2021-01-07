package defpackage;

import com.spotify.mobile.android.service.media.browser.m;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.t;
import com.spotify.remoteconfig.x4;

/* renamed from: ch1  reason: default package */
public final class ch1 implements fjf<bh1> {
    private final wlf<vj1> a;
    private final wlf<lj1> b;
    private final wlf<t> c;
    private final wlf<aqe> d;
    private final wlf<m> e;
    private final wlf<vxd> f;
    private final wlf<x4> g;
    private final wlf<o> h;

    public ch1(wlf<vj1> wlf, wlf<lj1> wlf2, wlf<t> wlf3, wlf<aqe> wlf4, wlf<m> wlf5, wlf<vxd> wlf6, wlf<x4> wlf7, wlf<o> wlf8) {
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
        return new bh1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
