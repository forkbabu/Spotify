package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.music.features.listeninghistory.ui.encore.EncoreEpisodeRowComponent;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<Long, tpf<? extends PlayerState>> {
    final /* synthetic */ EncoreEpisodeRowComponent.Holder a;

    a(EncoreEpisodeRowComponent.Holder holder) {
        this.a = holder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public tpf<? extends PlayerState> apply(Long l) {
        h.e(l, "it");
        return EncoreEpisodeRowComponent.Holder.I(this.a);
    }
}
