package defpackage;

import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.navigation.t;

/* renamed from: uh8  reason: default package */
public final class uh8 implements fjf<th8> {
    private final wlf<vp3> a;
    private final wlf<bq3> b;
    private final wlf<t> c;
    private final wlf<mh8> d;
    private final wlf<dv3> e;
    private final wlf<e> f;

    public uh8(wlf<vp3> wlf, wlf<bq3> wlf2, wlf<t> wlf3, wlf<mh8> wlf4, wlf<dv3> wlf5, wlf<e> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new th8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
