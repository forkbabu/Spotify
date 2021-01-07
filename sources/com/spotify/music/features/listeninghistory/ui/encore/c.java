package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.music.features.listeninghistory.ui.encore.EncoreEpisodeRowComponent;
import io.reactivex.functions.g;

final class c<T> implements g<Throwable> {
    final /* synthetic */ EncoreEpisodeRowComponent.Holder a;

    c(EncoreEpisodeRowComponent.Holder holder) {
        this.a = holder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        EpisodeRowListeningHistory D = EncoreEpisodeRowComponent.Holder.D(this.a);
        EncoreEpisodeRowComponent.Holder holder = this.a;
        D.render(EncoreEpisodeRowComponent.Holder.K(holder, false, EncoreEpisodeRowComponent.Holder.G(holder), 1));
    }
}
