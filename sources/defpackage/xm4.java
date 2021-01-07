package defpackage;

import android.app.Application;
import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.libs.connect.n;
import com.spotify.libs.connect.p;
import com.spotify.music.libs.connect.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: xm4  reason: default package */
public final class xm4 implements fjf<wm4> {
    private final wlf<Application> a;
    private final wlf<Handler> b;
    private final wlf<gs0> c;
    private final wlf<FireAndForgetResolver> d;
    private final wlf<p> e;
    private final wlf<dca> f;
    private final wlf<String> g;
    private final wlf<g> h;
    private final wlf<n> i;
    private final wlf<zr0> j;
    private final wlf<cs0> k;
    private final wlf<y> l;
    private final wlf<s<Boolean>> m;

    public xm4(wlf<Application> wlf, wlf<Handler> wlf2, wlf<gs0> wlf3, wlf<FireAndForgetResolver> wlf4, wlf<p> wlf5, wlf<dca> wlf6, wlf<String> wlf7, wlf<g> wlf8, wlf<n> wlf9, wlf<zr0> wlf10, wlf<cs0> wlf11, wlf<y> wlf12, wlf<s<Boolean>> wlf13) {
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
        this.l = wlf12;
        this.m = wlf13;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wm4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e, this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
