package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.g;

/* renamed from: zpb  reason: default package */
public final class zpb implements fjf<ypb> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<g<Long>> b;
    private final wlf<g<Ad>> c;
    private final wlf<tp3> d;
    private final wlf<xp3> e;
    private final wlf<Picasso> f;

    public zpb(wlf<g<ContextTrack>> wlf, wlf<g<Long>> wlf2, wlf<g<Ad>> wlf3, wlf<tp3> wlf4, wlf<xp3> wlf5, wlf<Picasso> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ypb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
