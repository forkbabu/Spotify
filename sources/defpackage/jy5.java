package defpackage;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.model.PlayerState;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: jy5  reason: default package */
public final class jy5 implements fjf<iy5> {
    private final wlf<Context> a;
    private final wlf<l2e> b;
    private final wlf<Picasso> c;
    private final wlf<ey5> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<g<c>> f;
    private final wlf<g<GaiaDevice>> g;
    private final wlf<y> h;
    private final wlf<CoverArtFetcher> i;
    private final wlf<er0> j;

    public jy5(wlf<Context> wlf, wlf<l2e> wlf2, wlf<Picasso> wlf3, wlf<ey5> wlf4, wlf<g<PlayerState>> wlf5, wlf<g<c>> wlf6, wlf<g<GaiaDevice>> wlf7, wlf<y> wlf8, wlf<CoverArtFetcher> wlf9, wlf<er0> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iy5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
