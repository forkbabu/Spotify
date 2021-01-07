package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.nowplaying.core.orientation.Orientation;
import io.reactivex.g;

/* renamed from: bqb  reason: default package */
public final class bqb implements fjf<aqb> {
    private final wlf<g<Ad>> a;
    private final wlf<hr3> b;
    private final wlf<Orientation> c;

    public bqb(wlf<g<Ad>> wlf, wlf<hr3> wlf2, wlf<Orientation> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aqb(this.a.get(), this.b.get(), this.c.get());
    }
}
