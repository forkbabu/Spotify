package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import io.reactivex.functions.g;

public final /* synthetic */ class a0 implements g {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ StationEntitySession b;

    public /* synthetic */ a0(k0 k0Var, StationEntitySession stationEntitySession) {
        this.a = k0Var;
        this.b = stationEntitySession;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, (LegacyPlayerState) obj);
    }
}
