package defpackage;

import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import java.util.List;

/* renamed from: gi1  reason: default package */
public final class gi1 implements fjf<fi1> {
    private final wlf<tj1> a;
    private final wlf<ii1> b;
    private final wlf<t> c;
    private final wlf<mj1> d;
    private final wlf<pj1<List<b>>> e;
    private final wlf<rj1> f;

    public gi1(wlf<tj1> wlf, wlf<ii1> wlf2, wlf<t> wlf3, wlf<mj1> wlf4, wlf<pj1<List<b>>> wlf5, wlf<rj1> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fi1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
