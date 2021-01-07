package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(Boolean.parseBoolean(((ContextTrack) obj).metadata().get("media.live")));
    }
}
