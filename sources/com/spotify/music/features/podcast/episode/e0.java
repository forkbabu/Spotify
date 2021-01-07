package com.spotify.music.features.podcast.episode;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.s;
import io.reactivex.y;

class e0 {
    private final pjc a;
    private final cqe b;

    public e0(pjc pjc, cqe cqe) {
        this.a = pjc;
        this.b = cqe;
    }

    public s<ojc> a(String str, y yVar) {
        return this.a.a(yVar).j0(new a(this, str)).G0((R) ojc.b()).E();
    }

    public ojc b(String str, PlayerState playerState) {
        boolean z;
        Optional<ContextTrack> track = playerState.track();
        if (track.isPresent()) {
            ContextTrack contextTrack = track.get();
            String str2 = contextTrack.metadata().get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
            if (str2 == null) {
                str2 = contextTrack.uri();
            }
            z = str2.equals(str);
        } else {
            z = false;
        }
        if (!z) {
            return ojc.a();
        }
        return ojc.d(str, !playerState.isPaused() && playerState.isPlaying(), playerState.position(this.b.d()).or((Optional<Long>) 0L).longValue(), playerState.duration().or((Optional<Long>) 0L).longValue());
    }
}
