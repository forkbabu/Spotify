package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((ContextTrack) obj).uri();
    }
}
