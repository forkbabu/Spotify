package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.music.follow.j;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class e<T> implements g<j> {
    final /* synthetic */ f a;
    final /* synthetic */ String b;
    final /* synthetic */ ArtistCardFollow.FollowingStatus c;

    e(f fVar, String str, ArtistCardFollow.FollowingStatus followingStatus) {
        this.a = fVar;
        this.b = str;
        this.c = followingStatus;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(j jVar) {
        j jVar2 = jVar;
        h.e(jVar2, "followData");
        this.a.c.a(jVar2);
        this.a.c.h(this.b, this.c);
        this.a.d.a(true);
    }
}
