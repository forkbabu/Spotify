package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.features.ads.i0;
import com.spotify.music.libs.thestage.d;
import com.spotify.music.navigation.t;

/* renamed from: yp3  reason: default package */
public final class yp3 implements fjf<xp3> {
    private final wlf<Fragment> a;
    private final wlf<i0> b;
    private final wlf<d> c;
    private final wlf<bv3> d;
    private final wlf<dv3> e;
    private final wlf<i80> f;
    private final wlf<t> g;

    public yp3(wlf<Fragment> wlf, wlf<i0> wlf2, wlf<d> wlf3, wlf<bv3> wlf4, wlf<dv3> wlf5, wlf<i80> wlf6, wlf<t> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static yp3 a(wlf<Fragment> wlf, wlf<i0> wlf2, wlf<d> wlf3, wlf<bv3> wlf4, wlf<dv3> wlf5, wlf<i80> wlf6, wlf<t> wlf7) {
        return new yp3(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xp3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
