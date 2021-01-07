package com.spotify.music.nowplaying.musicvideotoggle.widget.nextbutton;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.next.h;
import com.spotify.nowplaying.ui.components.controls.next.i;
import com.spotify.nowplaying.ui.components.controls.next.j;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public class c implements i.a {
    private final g<PlayerState> a;
    private final j b;
    private final h c;
    private final e d;
    private final q e = new q();
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.e f;
    private PlayerState g = PlayerState.EMPTY;
    private i h;

    public c(g<PlayerState> gVar, j jVar, h hVar, e eVar, com.spotify.music.nowplaying.musicvideotoggle.widget.e eVar2) {
        this.a = gVar;
        this.b = jVar;
        this.c = hVar;
        this.d = eVar;
        this.f = eVar2;
    }

    public static void a(c cVar, PlayerState playerState) {
        cVar.g = playerState;
        cVar.h.setNextEnabled(playerState.restrictions().disallowSkippingNextReasons().isEmpty());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i.a
    public void b() {
        String str;
        e eVar = this.d;
        String uri = this.g.track().get().uri();
        PlayerState playerState = this.g;
        if (playerState.nextTracks().isEmpty()) {
            str = "";
        } else {
            str = playerState.nextTracks().get(0).uri();
        }
        eVar.z(uri, str);
        this.c.a(this.g);
        ImmutableSet<String> disallowSkippingNextReasons = this.g.restrictions().disallowSkippingNextReasons();
        if (disallowSkippingNextReasons.isEmpty()) {
            this.f.d();
        } else if (disallowSkippingNextReasons.contains(DisallowReasons.MFT)) {
            this.b.call();
        }
    }

    public void c(i iVar) {
        iVar.getClass();
        this.h = iVar;
        iVar.setListener(this);
        this.f.c();
        this.e.a(this.a.subscribe(new b(this)));
    }

    public void d() {
        this.h.setListener(null);
        this.f.clear();
        this.e.c();
    }
}
