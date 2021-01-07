package com.spotify.mobile.android.hubframework.defaults.playback;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class b implements Function {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
