package com.spotify.music.features.queue.service;

import com.google.common.base.Function;
import com.spotify.playlist.models.o;

public final /* synthetic */ class n implements Function {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((o) obj).getUri();
    }
}
