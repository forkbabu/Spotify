package com.spotify.music.features.queue.playcontrols;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.a(this.a, (PlayerState) obj);
    }
}
