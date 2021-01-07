package com.spotify.music.features.ads;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class b0 implements l {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (ContextTrack) ((Optional) obj).get();
    }
}
