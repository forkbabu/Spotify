package com.spotify.music.features.queue.service;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;
import java.util.HashMap;

public final /* synthetic */ class i implements Function {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        HashMap hashMap = new HashMap(contextTrack.metadata());
        hashMap.put("is_queued", "true");
        return contextTrack.toBuilder().metadata(hashMap).build();
    }
}
