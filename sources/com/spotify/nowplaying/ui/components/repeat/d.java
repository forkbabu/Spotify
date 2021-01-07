package com.spotify.nowplaying.ui.components.repeat;

import com.spotify.nowplaying.ui.components.repeat.f;
import com.spotify.player.model.PlayerState;
import com.spotify.player.options.RepeatMode;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public final class d implements f.a {
    private final com.spotify.player.options.d a;
    private final g<PlayerState> b;
    private final c c;
    private final q d = new q();
    private PlayerState e;
    private f f;

    public d(com.spotify.player.options.d dVar, g<PlayerState> gVar, c cVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = cVar;
    }

    public static void d(d dVar, PlayerState playerState) {
        dVar.e = playerState;
        dVar.f.setRepeatMode(bqd.b(playerState));
        dVar.f.setRepeatEnabled(bqd.c(playerState.restrictions()));
    }

    public void a() {
        this.f.setListener(null);
        this.d.c();
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.f.a
    public void b() {
        RepeatMode b2 = bqd.b(this.e);
        RepeatMode d2 = bqd.d(b2, this.e.restrictions());
        this.c.k(this.e.track().get().uri(), d2);
        if (b2 != d2) {
            this.d.a(this.a.setRepeatMode(d2).subscribe());
        }
    }

    public void c(f fVar) {
        fVar.getClass();
        this.f = fVar;
        fVar.setListener(this);
        this.d.a(this.b.subscribe(new b(this)));
    }
}
