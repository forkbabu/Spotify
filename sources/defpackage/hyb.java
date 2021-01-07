package defpackage;

import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: hyb  reason: default package */
public final class hyb implements fjf<gyb> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<iqd> c;
    private final wlf<CoverArtFetcher> d;
    private final wlf<pl9> e;

    public hyb(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<iqd> wlf3, wlf<CoverArtFetcher> wlf4, wlf<pl9> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static hyb a(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<iqd> wlf3, wlf<CoverArtFetcher> wlf4, wlf<pl9> wlf5) {
        return new hyb(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gyb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
