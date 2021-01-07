package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((PlayerState) obj).track().isPresent();
    }
}
