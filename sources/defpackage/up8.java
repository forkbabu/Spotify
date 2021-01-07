package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.connection.l;
import com.spotify.music.features.tasteonboarding.i;
import io.reactivex.y;

/* renamed from: up8  reason: default package */
public final class up8 implements fjf<tp8> {
    private final wlf<vp8> a;
    private final wlf<i> b;
    private final wlf<y> c;
    private final wlf<lp8> d;
    private final wlf<k> e;
    private final wlf<l> f;

    public up8(wlf<vp8> wlf, wlf<i> wlf2, wlf<y> wlf3, wlf<lp8> wlf4, wlf<k> wlf5, wlf<l> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tp8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
