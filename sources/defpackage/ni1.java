package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import java.util.List;

/* renamed from: ni1  reason: default package */
public final class ni1 implements fjf<mi1> {
    private final wlf<Context> a;
    private final wlf<tj1> b;
    private final wlf<mj1> c;
    private final wlf<t> d;
    private final wlf<pj1<List<b>>> e;
    private final wlf<rj1> f;

    public ni1(wlf<Context> wlf, wlf<tj1> wlf2, wlf<mj1> wlf3, wlf<t> wlf4, wlf<pj1<List<b>>> wlf5, wlf<rj1> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mi1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
