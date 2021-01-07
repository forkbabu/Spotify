package com.spotify.music.autoplay;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ cqe b;

    public /* synthetic */ b(PlayerState playerState, cqe cqe) {
        this.a = playerState;
        this.b = cqe;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        PlayerState playerState = this.a;
        cqe cqe = this.b;
        PlayerState playerState2 = (PlayerState) obj;
        if (!playerState2.prevTracks().isEmpty()) {
            return false;
        }
        if (!(playerState.playbackId().isPresent() && playerState2.playbackId().isPresent() && !playerState.playbackId().get().equals(playerState2.playbackId().get()))) {
            return false;
        }
        Optional<Long> position = playerState2.position(cqe.d());
        if (!(position.isPresent() && position.get().longValue() == 0) || playerState2.timestamp() - playerState.timestamp() < 5000) {
            return false;
        }
        return true;
    }
}
