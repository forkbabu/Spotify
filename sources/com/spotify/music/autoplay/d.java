package com.spotify.music.autoplay;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return Boolean.TRUE;
    }
}