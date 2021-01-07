package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.common.view.pager.h;
import com.spotify.music.nowplaying.core.util.CoverArtFetcher;
import com.spotify.music.nowplaying.musicvideotoggle.widget.e;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import java.util.Collections;

/* renamed from: lzb  reason: default package */
public class lzb implements h.a {
    private final g<PlayerState> a;
    private final iqd b;
    private final CoverArtFetcher c;
    private final q d = new q();
    private final e e;
    private h f;
    private PlayerState g = PlayerState.EMPTY;

    public lzb(g<PlayerState> gVar, iqd iqd, e eVar, CoverArtFetcher coverArtFetcher) {
        this.a = gVar;
        this.b = iqd;
        this.c = coverArtFetcher;
        this.e = eVar;
    }

    public static void c(lzb lzb, PlayerState playerState) {
        lzb.g = playerState;
        lzb.f.d(playerState.prevTracks(), playerState.track().get(), playerState.nextTracks());
        CoverArtFetcher.CoverArtSize coverArtSize = CoverArtFetcher.CoverArtSize.LARGE;
        lzb.c.a(playerState.track().transform(jzb.a).or((Optional<V>) ((V) Collections.emptyList())), coverArtSize);
        lzb.c.a(playerState.nextTracks(), coverArtSize);
        lzb.c.a(playerState.prevTracks(), coverArtSize);
        lzb.f.setDisallowPeekLeft(!playerState.restrictions().disallowPeekingPrevReasons().isEmpty());
        lzb.f.setDisallowPeekRight(!playerState.restrictions().disallowPeekingNextReasons().isEmpty());
        lzb.f.setDisallowScrollLeft(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
        lzb.f.setDisallowScrollRight(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
        lzb.f.setScrollLock(false);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h.a
    public void a() {
        String uri = this.g.track().get().uri();
        iqd iqd = this.b;
        PlayerState playerState = this.g;
        int size = playerState.prevTracks().size();
        iqd.a(uri, size > 0 ? playerState.prevTracks().get(size - 1).uri() : "");
        this.f.setScrollLock(true);
        this.e.a(true);
    }

    @Override // com.spotify.music.nowplaying.common.view.pager.h.a
    public void b() {
        String str;
        String uri = this.g.track().get().uri();
        iqd iqd = this.b;
        PlayerState playerState = this.g;
        if (playerState.nextTracks().isEmpty()) {
            str = "";
        } else {
            str = playerState.nextTracks().get(0).uri();
        }
        iqd.t(uri, str);
        this.f.setScrollLock(true);
        this.e.d();
    }

    public void d(h hVar) {
        hVar.getClass();
        this.f = hVar;
        hVar.setListener(this);
        this.d.a(this.a.subscribe(new kzb(this)));
    }

    public void e() {
        this.d.c();
    }
}
