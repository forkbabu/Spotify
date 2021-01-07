package defpackage;

import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: gyb  reason: default package */
public class gyb extends f {
    private final pl9 h;

    public gyb(d dVar, g<PlayerState> gVar, iqd iqd, CoverArtFetcher coverArtFetcher, pl9 pl9) {
        super(dVar, gVar, iqd, coverArtFetcher);
        this.h = pl9;
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.f, com.spotify.music.nowplaying.common.view.pager.h.a
    public void b() {
        super.b();
        this.h.E2().c();
    }
}
