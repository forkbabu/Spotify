package com.spotify.music.features.listeninghistory.ui.encore;

import com.google.common.base.Optional;
import com.spotify.music.features.listeninghistory.ui.encore.EncoreTrackRowComponent;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class f<T> implements g<Optional<String>> {
    final /* synthetic */ EncoreTrackRowComponent.Holder a;

    f(EncoreTrackRowComponent.Holder holder) {
        this.a = holder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Optional<String> optional) {
        Optional<String> optional2 = optional;
        o81 o81 = (o81) EncoreTrackRowComponent.Holder.B(this.a).events().get("click");
        EncoreTrackRowComponent.Holder.E(this.a).render(EncoreTrackRowComponent.Holder.D(this.a, h.a(optional2.orNull(), o81 != null ? an5.a(o81) : null)));
    }
}
