package defpackage;

import android.content.Context;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.remoteconfig.b7;

/* renamed from: fy8  reason: default package */
public final class fy8 implements fjf<ey8> {
    private final wlf<Context> a;
    private final wlf<wy8> b;
    private final wlf<k2> c;
    private final wlf<d3> d;
    private final wlf<ox8> e;
    private final wlf<pea> f;
    private final wlf<ay8> g;
    private final wlf<jy8> h;
    private final wlf<xx8> i;
    private final wlf<b7> j;
    private final wlf<gy8> k;

    public fy8(wlf<Context> wlf, wlf<wy8> wlf2, wlf<k2> wlf3, wlf<d3> wlf4, wlf<ox8> wlf5, wlf<pea> wlf6, wlf<ay8> wlf7, wlf<jy8> wlf8, wlf<xx8> wlf9, wlf<b7> wlf10, wlf<gy8> wlf11) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ey8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
