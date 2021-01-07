package com.spotify.player.stateful;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;

/* access modifiers changed from: package-private */
public class t {
    private final cqe a;
    private PlayerState b = PlayerState.EMPTY;
    private Optional<Long> c = Optional.absent();
    private long d;

    t(cqe cqe) {
        this.a = cqe;
    }

    public Optional<Long> a(long j) {
        if (!this.b.positionAsOfTimestamp().isPresent() || !this.b.duration().isPresent()) {
            return Optional.absent();
        }
        return this.c.or(this.b.position(j));
    }

    public Optional<Double> b() {
        return this.b.duration().isPresent() && !this.c.isPresent() ? this.b.playbackSpeed() : Optional.of(Double.valueOf(0.0d));
    }

    public void c(long j) {
        if (!(this.b.duration().or(0L).longValue() == 0 || !this.b.restrictions().disallowSeekingReasons().isEmpty())) {
            this.c = Optional.of(Long.valueOf(j));
            this.d = this.a.d();
        }
    }

    public void d(PlayerState playerState) {
        if (!this.c.isPresent() || this.d < playerState.timestamp()) {
            this.b = playerState;
            this.c = Optional.absent();
            this.d = 0;
        }
    }
}
