package com.spotify.music.features.listeninghistory.ui.encore;

import com.spotify.music.features.listeninghistory.ui.encore.EncoreTrackRowComponent;

final class g<T> implements io.reactivex.functions.g<Throwable> {
    final /* synthetic */ EncoreTrackRowComponent.Holder a;

    g(EncoreTrackRowComponent.Holder holder) {
        this.a = holder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        EncoreTrackRowComponent.Holder.E(this.a).render(EncoreTrackRowComponent.Holder.G(this.a, false, 1));
    }
}
