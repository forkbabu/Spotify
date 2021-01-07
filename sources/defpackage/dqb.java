package defpackage;

import com.spotify.ads.uicomponents.secondaryintent.e;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.g;

/* renamed from: dqb  reason: default package */
public final class dqb implements fjf<cqb> {
    private final wlf<e> a;
    private final wlf<vp3> b;
    private final wlf<bq3> c;
    private final wlf<g<Ad>> d;
    private final wlf<ws3> e;

    public dqb(wlf<e> wlf, wlf<vp3> wlf2, wlf<bq3> wlf3, wlf<g<Ad>> wlf4, wlf<ws3> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cqb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
