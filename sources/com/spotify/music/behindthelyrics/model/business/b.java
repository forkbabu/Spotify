package com.spotify.music.behindthelyrics.model.business;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;

public abstract class b implements cq1 {
    public static cq1 f(PlayerState playerState, cqe cqe) {
        return new a(playerState.position(cqe.d()).or((Optional<Long>) 0L).longValue(), playerState.playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).doubleValue(), playerState.isPlaying(), playerState.isPaused(), playerState.duration().or((Optional<Long>) 0L).longValue());
    }
}
