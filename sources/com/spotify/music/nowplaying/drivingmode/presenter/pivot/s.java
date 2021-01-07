package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ n0 a;

    public /* synthetic */ s(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((LegacyPlayerState) obj);
    }
}
