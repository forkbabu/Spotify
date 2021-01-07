package com.spotify.music.libs.mediasession;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.g;
import io.reactivex.z;

@Deprecated
public class q0 {
    private final d a;
    private final g<PlayerState> b;
    private final cqe c;

    public q0(d dVar, g<PlayerState> gVar, cqe cqe) {
        this.a = dVar;
        this.b = gVar;
        this.c = cqe;
    }

    private z<zwd> d(int i) {
        z<R> A = this.b.E().A(new l(this, i)).A(c.a);
        d dVar = this.a;
        dVar.getClass();
        return A.s(new k(dVar));
    }

    public z<zwd> a(ContextTrack contextTrack) {
        if (kxd.i(contextTrack)) {
            return d(15000);
        }
        return this.a.a(c.i());
    }

    public z<zwd> b(ContextTrack contextTrack) {
        if (kxd.i(contextTrack)) {
            return d(-15000);
        }
        return this.a.a(c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
    }

    public /* synthetic */ Long c(int i, PlayerState playerState) {
        return Long.valueOf(playerState.position(this.c.d()).or((Optional<Long>) 0L).longValue() + ((long) i));
    }
}
