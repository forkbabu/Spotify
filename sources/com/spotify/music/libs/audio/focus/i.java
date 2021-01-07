package com.spotify.music.libs.audio.focus;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class i implements Function {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(kxd.l((ContextTrack) obj));
    }
}
