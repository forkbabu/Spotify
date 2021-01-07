package com.spotify.nowplaying.container;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.h;

public final class d {
    private final ImmutableList<cqd> a;

    public d(ImmutableList<cqd> immutableList) {
        h.e(immutableList, "nowPlayingModes");
        this.a = immutableList;
    }

    public final cqd a(PlayerState playerState) {
        h.e(playerState, "playerState");
        Optional<ContextTrack> track = playerState.track();
        h.d(track, "playerState.track()");
        if (track.isPresent()) {
            for (T t : this.a) {
                if (t.a(playerState)) {
                    h.d(t, "nowPlayingModes.first { it.accept(playerState) }");
                    return t;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
