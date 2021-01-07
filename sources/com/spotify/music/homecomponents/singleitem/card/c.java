package com.spotify.music.homecomponents.singleitem.card;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

final class c<T> implements g<PlayerState> {
    final /* synthetic */ String a;
    final /* synthetic */ HomeSingleFocusCardViewBinder b;

    c(String str, HomeSingleFocusCardViewBinder homeSingleFocusCardViewBinder) {
        this.a = str;
        this.b = homeSingleFocusCardViewBinder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(PlayerState playerState) {
        boolean b2 = ar9.b(playerState, this.a);
        this.b.u1(b2);
        this.b.C2(b2);
    }
}
