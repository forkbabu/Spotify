package com.spotify.nowplaying.ui.components.shuffle;

import com.spotify.nowplaying.ui.components.shuffle.f;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public final class d implements f.a {
    private final com.spotify.player.options.d a;
    private final g<PlayerState> b;
    private final c c;
    private final q d = new q();
    private String e;
    private boolean f;
    private f g;

    public d(com.spotify.player.options.d dVar, g<PlayerState> gVar, c cVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = cVar;
    }

    public static void a(d dVar, PlayerState playerState) {
        dVar.getClass();
        dVar.e = playerState.track().get().uri();
        boolean shufflingContext = playerState.options().shufflingContext();
        dVar.f = shufflingContext;
        dVar.g.setShuffleState(shufflingContext);
        dVar.g.setShuffleEnabled(playerState.restrictions().disallowTogglingShuffleReasons().isEmpty());
    }

    public void b() {
        this.c.p(this.e, this.f);
        this.d.a(this.a.a(!this.f).subscribe());
    }

    public void c(f fVar) {
        fVar.getClass();
        this.g = fVar;
        fVar.setListener(this);
        this.d.a(this.b.subscribe(new b(this)));
    }

    public void d() {
        this.g.setListener(null);
        this.d.c();
    }
}
