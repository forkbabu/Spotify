package com.spotify.music.lyrics.fullscreen;

import com.spotify.player.model.PlayerState;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).track();
    }
}
