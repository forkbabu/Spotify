package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector;
import com.spotify.music.podcast.freetierlikes.tabs.k;
import io.reactivex.y;

/* renamed from: qlc  reason: default package */
public final class qlc implements fjf<plc> {
    private final wlf<y> a;
    private final wlf<rlc> b;
    private final wlf<k> c;
    private final wlf<vjc> d;
    private final wlf<Integer> e;
    private final wlf<etc> f;
    private final wlf<EpisodeTypeViewSelector> g;

    public qlc(wlf<y> wlf, wlf<rlc> wlf2, wlf<k> wlf3, wlf<vjc> wlf4, wlf<Integer> wlf5, wlf<etc> wlf6, wlf<EpisodeTypeViewSelector> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static qlc a(wlf<y> wlf, wlf<rlc> wlf2, wlf<k> wlf3, wlf<vjc> wlf4, wlf<Integer> wlf5, wlf<etc> wlf6, wlf<EpisodeTypeViewSelector> wlf7) {
        return new qlc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new plc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().intValue(), this.f.get(), this.g.get());
    }
}
