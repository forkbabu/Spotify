package com.spotify.music.nowplaying.common.view.pager;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.common.view.pager.h;
import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import java.util.Collections;

public class f implements h.a {
    private final d a;
    private final g<PlayerState> b;
    private final iqd c;
    private final CoverArtFetcher d;
    private final q e = new q();
    private h f;
    private PlayerState g = PlayerState.EMPTY;

    public f(d dVar, g<PlayerState> gVar, iqd iqd, CoverArtFetcher coverArtFetcher) {
        this.a = dVar;
        this.b = gVar;
        this.c = iqd;
        this.d = coverArtFetcher;
    }

    public static void c(f fVar, PlayerState playerState) {
        fVar.g = playerState;
        fVar.f.d(playerState.prevTracks(), playerState.track().get(), playerState.nextTracks());
        CoverArtFetcher.CoverArtSize coverArtSize = CoverArtFetcher.CoverArtSize.LARGE;
        fVar.d.a(playerState.track().transform(a.a).or((Optional<V>) ((V) Collections.emptyList())), coverArtSize);
        fVar.d.a(playerState.nextTracks(), coverArtSize);
        fVar.d.a(playerState.prevTracks(), coverArtSize);
        fVar.f.setDisallowPeekLeft(!playerState.restrictions().disallowPeekingPrevReasons().isEmpty());
        fVar.f.setDisallowPeekRight(!playerState.restrictions().disallowPeekingNextReasons().isEmpty());
        fVar.f.setDisallowScrollLeft(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
        fVar.f.setDisallowScrollRight(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
        fVar.f.setScrollLock(false);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h.a
    public void a() {
        String uri = this.g.track().get().uri();
        iqd iqd = this.c;
        PlayerState playerState = this.g;
        int size = playerState.prevTracks().size();
        iqd.a(uri, size > 0 ? playerState.prevTracks().get(size - 1).uri() : "");
        this.f.setScrollLock(true);
        this.e.a(this.a.a(c.k()).subscribe());
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h.a
    public void b() {
        String str;
        String uri = this.g.track().get().uri();
        iqd iqd = this.c;
        PlayerState playerState = this.g;
        if (playerState.nextTracks().isEmpty()) {
            str = "";
        } else {
            str = playerState.nextTracks().get(0).uri();
        }
        iqd.t(uri, str);
        this.f.setScrollLock(true);
        this.e.a(this.a.a(c.i()).subscribe());
    }

    public void d(h hVar) {
        hVar.getClass();
        this.f = hVar;
        hVar.setListener(this);
        this.e.a(this.b.subscribe(new e(this)));
    }

    public void e() {
        this.e.c();
        this.f.setListener(null);
    }
}
