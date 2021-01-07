package com.spotify.music.playlist.extender;

import com.google.common.base.Function;
import com.spotify.music.playlist.extender.model.RecTrack;

public final /* synthetic */ class r implements Function {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((RecTrack) obj).getUri();
    }
}
