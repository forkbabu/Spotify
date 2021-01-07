package com.spotify.music.artist.dac.ui.binders;

import com.spotify.encore.consumer.components.artist.api.header.ArtistHeader;
import com.spotify.music.follow.j;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T> implements g<j> {
    final /* synthetic */ ArtistHeaderComponentBinder a;
    final /* synthetic */ ArtistHeader.Model b;

    c(ArtistHeaderComponentBinder artistHeaderComponentBinder, ArtistHeader.Model model) {
        this.a = artistHeaderComponentBinder;
        this.b = model;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(j jVar) {
        j jVar2 = jVar;
        ArtistHeaderComponentBinder artistHeaderComponentBinder = this.a;
        h.d(jVar2, "followData");
        ArtistHeaderComponentBinder.l(artistHeaderComponentBinder, jVar2, this.b);
    }
}
