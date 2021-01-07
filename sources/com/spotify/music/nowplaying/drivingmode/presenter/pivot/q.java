package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class q implements l {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LegacyPlayerState c;
    public final /* synthetic */ PlayerTrack f;

    public /* synthetic */ q(n0 n0Var, String str, LegacyPlayerState legacyPlayerState, PlayerTrack playerTrack) {
        this.a = n0Var;
        this.b = str;
        this.c = legacyPlayerState;
        this.f = playerTrack;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n0 n0Var = this.a;
        String str = this.b;
        n0Var.k(str, this.c, this.f, (String) obj);
        return str;
    }
}
