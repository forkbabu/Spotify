package com.spotify.mobile.android.hubframework.defaults.playback;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ i a;

    public /* synthetic */ d(i iVar) {
        this.a = iVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((PlayerState) obj);
    }
}
