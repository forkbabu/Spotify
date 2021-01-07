package defpackage;

import com.spotify.mobile.android.service.media.browser.m;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.t;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.remoteconfig.x4;

/* renamed from: wg1  reason: default package */
public final class wg1 implements fjf<vg1> {
    private final wlf<vj1> a;
    private final wlf<lj1> b;
    private final wlf<t> c;
    private final wlf<aqe> d;
    private final wlf<m> e;
    private final wlf<vxd> f;
    private final wlf<x4> g;
    private final wlf<o> h;
    private final wlf<d> i;

    public wg1(wlf<vj1> wlf, wlf<lj1> wlf2, wlf<t> wlf3, wlf<aqe> wlf4, wlf<m> wlf5, wlf<vxd> wlf6, wlf<x4> wlf7, wlf<o> wlf8, wlf<d> wlf9) {
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
        return new vg1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
