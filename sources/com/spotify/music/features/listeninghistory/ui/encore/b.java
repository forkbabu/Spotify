package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.music.features.listeninghistory.ui.encore.EncoreEpisodeRowComponent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class b<T> implements g<PlayerState> {
    final /* synthetic */ EncoreEpisodeRowComponent.Holder a;

    b(EncoreEpisodeRowComponent.Holder holder) {
        this.a = holder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(PlayerState playerState) {
        int i;
        PlayerState playerState2 = playerState;
        ContextTrack orNull = playerState2.track().orNull();
        String uri = orNull != null ? orNull.uri() : null;
        if (h.a(uri, EncoreEpisodeRowComponent.Holder.E(this.a))) {
            EncoreEpisodeRowComponent.Holder holder = this.a;
            h.d(playerState2, "playerState");
            holder.getClass();
            if (playerState2.isPlaying() && !playerState2.isPaused()) {
                i = (int) playerState2.position(EncoreEpisodeRowComponent.Holder.B(this.a).d()).get().longValue();
                EncoreEpisodeRowComponent.Holder.H(this.a).put(EncoreEpisodeRowComponent.Holder.E(this.a), Integer.valueOf(i));
                EncoreEpisodeRowComponent.Holder.D(this.a).render(EncoreEpisodeRowComponent.Holder.C(this.a, h.a(uri, EncoreEpisodeRowComponent.Holder.E(this.a)), i));
            }
        }
        i = EncoreEpisodeRowComponent.Holder.G(this.a);
        EncoreEpisodeRowComponent.Holder.D(this.a).render(EncoreEpisodeRowComponent.Holder.C(this.a, h.a(uri, EncoreEpisodeRowComponent.Holder.E(this.a)), i));
    }
}
