package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class d0 implements l {
    public final /* synthetic */ s0 a;

    public /* synthetic */ d0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((PlayerState) obj);
    }
}
