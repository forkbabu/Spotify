package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.elements.playbutton.PlayState;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

final class d<T, R> implements l<PlayerState, v<? extends PlayState>> {
    final /* synthetic */ AlbumHeaderTransformer a;

    d(AlbumHeaderTransformer albumHeaderTransformer) {
        this.a = albumHeaderTransformer;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends PlayState> apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        h.e(playerState2, "playerState");
        if (!h.a(this.a.c, playerState2.contextUri())) {
            return s.i0(AlbumHeaderTransformer.c(this.a));
        }
        if (!playerState2.isPlaying() || playerState2.isPaused()) {
            return s.i0(AlbumHeaderTransformer.c(this.a));
        }
        return s.i0(PlayState.PAUSE);
    }
}
