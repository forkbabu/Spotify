package com.spotify.music.libs.connect;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ n a;

    public /* synthetic */ c(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        n.j(this.a, (PlayerState) obj);
    }
}
