package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ p(n0 n0Var, String str) {
        this.a = n0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i(this.b, (PlayerContext) obj);
    }
}
