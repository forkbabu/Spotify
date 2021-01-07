package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import java.util.List;

/* renamed from: ai1  reason: default package */
public final class ai1 implements fjf<zh1> {
    private final wlf<tj1> a;
    private final wlf<mj1> b;
    private final wlf<t> c;
    private final wlf<pj1<List<b>>> d;
    private final wlf<rj1> e;
    private final wlf<qd1> f;
    private final wlf<rc1> g;

    public ai1(wlf<tj1> wlf, wlf<mj1> wlf2, wlf<t> wlf3, wlf<pj1<List<b>>> wlf4, wlf<rj1> wlf5, wlf<qd1> wlf6, wlf<rc1> wlf7) {
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
        return new zh1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
