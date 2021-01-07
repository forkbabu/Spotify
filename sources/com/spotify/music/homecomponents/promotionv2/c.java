package com.spotify.music.homecomponents.promotionv2;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ h a;
    public final /* synthetic */ m b;

    public /* synthetic */ c(h hVar, m mVar) {
        this.a = hVar;
        this.b = mVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (PlayerState) obj);
    }
}
