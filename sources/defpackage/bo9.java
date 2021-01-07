package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import java.util.List;

/* renamed from: bo9  reason: default package */
public final class bo9 implements fjf<ao9> {
    private final wlf<Context> a;
    private final wlf<t> b;
    private final wlf<cqe> c;
    private final wlf<cj1> d;
    private final wlf<mj1> e;
    private final wlf<pj1<List<b>>> f;
    private final wlf<rj1> g;
    private final wlf<String> h;
    private final wlf<dj1> i;

    public bo9(wlf<Context> wlf, wlf<t> wlf2, wlf<cqe> wlf3, wlf<cj1> wlf4, wlf<mj1> wlf5, wlf<pj1<List<b>>> wlf6, wlf<rj1> wlf7, wlf<String> wlf8, wlf<dj1> wlf9) {
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
        return new ao9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
