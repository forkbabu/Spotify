package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class c implements n {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
