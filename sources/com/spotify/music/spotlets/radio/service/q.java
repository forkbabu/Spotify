package com.spotify.music.spotlets.radio.service;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class q implements n {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = d0.p;
        return ((PlayerState) obj).track().isPresent();
    }
}
