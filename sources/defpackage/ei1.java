package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import java.util.List;

/* renamed from: ei1  reason: default package */
public final class ei1 implements fjf<di1> {
    private final wlf<tj1> a;
    private final wlf<jj1> b;
    private final wlf<mj1> c;
    private final wlf<t> d;
    private final wlf<pj1<List<b>>> e;
    private final wlf<oj1<List<b>>> f;
    private final wlf<rj1> g;

    public ei1(wlf<tj1> wlf, wlf<jj1> wlf2, wlf<mj1> wlf3, wlf<t> wlf4, wlf<pj1<List<b>>> wlf5, wlf<oj1<List<b>>> wlf6, wlf<rj1> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new di1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
