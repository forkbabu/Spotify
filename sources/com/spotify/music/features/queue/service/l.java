package com.spotify.music.features.queue.service;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class l implements Function {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ContextTrack.create((String) obj);
    }
}
