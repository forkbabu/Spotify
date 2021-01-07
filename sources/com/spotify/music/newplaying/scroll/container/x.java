package com.spotify.music.newplaying.scroll.container;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class x implements l {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).playbackId().get();
    }
}
