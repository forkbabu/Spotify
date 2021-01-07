package com.spotify.music.homecomponents.card.artistcardfollow;

import com.spotify.base.java.logging.Logger;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.music.follow.j;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<Throwable, j> {
    final /* synthetic */ Component a;
    final /* synthetic */ ArtistCardFollow.Model b;
    final /* synthetic */ String c;

    c(Component component, ArtistCardFollow.Model model, String str) {
        this.a = component;
        this.b = model;
        this.c = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public j apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "throwable");
        this.a.render(ArtistCardFollow.Model.copy$default(this.b, null, null, ArtistCardFollow.FollowingStatus.Error, 3, null));
        Logger.d("Could not make a follow update for the artist with URI: %s, \nReason: %s", this.c, th2.getMessage());
        return j.b("", 0, 0, false, false);
    }
}
