package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ r a;

    public /* synthetic */ f(r rVar) {
        this.a = rVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r.b(this.a, (PlayerState) obj);
    }
}
