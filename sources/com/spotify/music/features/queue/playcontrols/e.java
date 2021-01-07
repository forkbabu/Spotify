package com.spotify.music.features.queue.playcontrols;

import com.google.common.base.Optional;
import com.spotify.music.features.queue.logging.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;

public class e {
    private final g<PlayerState> a;
    private final d b;
    private final cqe c;
    private final c d;
    private final h e;
    private final q f = new q();
    private PlayerState g = PlayerState.EMPTY;

    public e(g<PlayerState> gVar, y yVar, d dVar, cqe cqe, c cVar, h hVar) {
        this.a = gVar.Q(yVar);
        this.b = dVar;
        this.c = cqe;
        this.d = cVar;
        this.e = hVar;
    }

    public static void a(e eVar, PlayerState playerState) {
        eVar.g = playerState;
        eVar.e.setPlayPauseButtonShowAsPaused(playerState.isPaused());
        Restrictions restrictions = playerState.restrictions();
        if (playerState.isPaused()) {
            eVar.e.setPlayPauseButtonEnabled(restrictions.disallowResumingReasons().isEmpty());
        } else {
            eVar.e.setPlayPauseButtonEnabled(restrictions.disallowPausingReasons().isEmpty());
        }
        boolean isEmpty = playerState.restrictions().disallowSkippingNextReasons().isEmpty();
        boolean isEmpty2 = playerState.restrictions().disallowSkippingPrevReasons().isEmpty() | playerState.restrictions().disallowSeekingReasons().isEmpty();
        eVar.e.setSkipToNextTrackIconEnabled(isEmpty);
        eVar.e.setSkipToPreviousTrackEnabled(isEmpty2);
        eVar.e.setSeekingEnabled(playerState.restrictions().disallowSeekingReasons().isEmpty());
        long longValue = playerState.position(eVar.c.d()).or((Optional<Long>) 0L).longValue();
        long longValue2 = playerState.duration().or((Optional<Long>) 0L).longValue();
        Optional<Double> playbackSpeed = playerState.playbackSpeed();
        Double valueOf = Double.valueOf(0.0d);
        if (playbackSpeed.or((Optional<Double>) valueOf).doubleValue() == 0.0d) {
            longValue2 = longValue;
        }
        eVar.e.setSeekbarLength(playerState.duration().or((Optional<Long>) 0L).longValue());
        eVar.e.a(longValue, longValue2, playerState.playbackSpeed().or((Optional<Double>) valueOf).floatValue());
    }

    public void b() {
        this.d.i();
        this.f.a(this.b.a(com.spotify.player.controls.c.i()).subscribe());
    }

    public void c() {
        this.d.m();
        this.f.a(this.b.a(com.spotify.player.controls.c.l(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).subscribe());
    }

    public void d() {
        this.f.a(this.a.subscribe(new a(this)));
    }

    public void e() {
        this.f.c();
    }

    public void f() {
        if (this.g.isPlaying()) {
            this.d.l(this.g.isPaused());
        }
        if (this.g.isPaused()) {
            this.f.a(this.b.a(com.spotify.player.controls.c.e()).subscribe());
        } else {
            this.f.a(this.b.a(com.spotify.player.controls.c.c()).subscribe());
        }
    }
}
