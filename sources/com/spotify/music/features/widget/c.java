package com.spotify.music.features.widget;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ k a;

    public /* synthetic */ c(k kVar) {
        this.a = kVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        k.h(this.a, (PlayerState) obj);
    }
}
