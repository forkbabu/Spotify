package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class y implements g {
    public final /* synthetic */ k0 a;

    public /* synthetic */ y(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i((LegacyPlayerState) obj);
    }
}
