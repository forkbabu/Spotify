package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new c(((PlayerState) obj).contextUri());
    }
}
