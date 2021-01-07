package com.spotify.nowplaying.ui.components.controls.seekforward;

import com.google.common.base.Optional;
import com.spotify.nowplaying.ui.components.controls.seekforward.i;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;

public final class g implements i.a {
    private final cqe a;
    private final d b;
    private final io.reactivex.g<PlayerState> c;
    private final f d;
    private final q e = new q();
    private i f;
    private String g;

    public g(d dVar, io.reactivex.g<PlayerState> gVar, f fVar, cqe cqe) {
        this.b = dVar;
        this.c = gVar;
        this.d = fVar;
        this.a = cqe;
    }

    public static long a(g gVar, PlayerState playerState) {
        return Math.min(playerState.position(gVar.a.d()).or((Optional<Long>) 0L).longValue() + 15000, playerState.duration().or((Optional<Long>) 0L).longValue());
    }

    public static void b(g gVar, PlayerState playerState) {
        gVar.getClass();
        gVar.g = playerState.track().get().uri();
        gVar.f.setSeekForwardEnabled(playerState.restrictions().disallowSeekingReasons().isEmpty());
    }

    public void c() {
        this.d.h(this.g, 15000);
        q qVar = this.e;
        io.reactivex.g<R> O = this.c.h0(1).O(new d(this)).O(a.a);
        d dVar = this.b;
        dVar.getClass();
        qVar.a(O.J(new b(dVar)).subscribe());
    }

    public void d(i iVar) {
        iVar.getClass();
        this.f = iVar;
        iVar.setListener(this);
        this.e.a(this.c.subscribe(new e(this)));
    }

    public void e() {
        this.f.setListener(null);
        this.e.c();
    }
}
