package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.nowplaying.core.orientation.Orientation;
import io.reactivex.g;

/* renamed from: xpb  reason: default package */
public final class xpb implements fjf<wpb> {
    private final wlf<g<Ad>> a;
    private final wlf<g<Long>> b;
    private final wlf<tp3> c;
    private final wlf<zp3> d;
    private final wlf<xp3> e;
    private final wlf<Orientation> f;

    public xpb(wlf<g<Ad>> wlf, wlf<g<Long>> wlf2, wlf<tp3> wlf3, wlf<zp3> wlf4, wlf<xp3> wlf5, wlf<Orientation> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wpb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
