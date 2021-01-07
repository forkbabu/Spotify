package defpackage;

import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.music.nowplaying.musicvideotoggle.widget.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: mzb  reason: default package */
public final class mzb implements fjf<lzb> {
    private final wlf<g<PlayerState>> a;
    private final wlf<iqd> b;
    private final wlf<e> c;
    private final wlf<CoverArtFetcher> d;

    public mzb(wlf<g<PlayerState>> wlf, wlf<iqd> wlf2, wlf<e> wlf3, wlf<CoverArtFetcher> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lzb(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
