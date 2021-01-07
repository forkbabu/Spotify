package com.spotify.music.artist.dac.ui.binders;

import com.spotify.music.follow.j;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b<T, R> implements l<com.spotify.playlist.models.b, tpf<? extends j>> {
    final /* synthetic */ ArtistHeaderComponentBinder a;
    final /* synthetic */ String b;

    b(ArtistHeaderComponentBinder artistHeaderComponentBinder, String str) {
        this.a = artistHeaderComponentBinder;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public tpf<? extends j> apply(com.spotify.playlist.models.b bVar) {
        com.spotify.playlist.models.b bVar2 = bVar;
        h.e(bVar2, "artist");
        gj2 h = ArtistHeaderComponentBinder.h(this.a);
        String str = this.b;
        j b2 = j.b(str, 0, 0, bVar2.j(), bVar2.i());
        h.d(b2, "FollowData.create(\n     …                        )");
        return h.b(str, b2);
    }
}
