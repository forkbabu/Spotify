package com.spotify.music.nowplaying.common.view.pager;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;

public final /* synthetic */ class a implements Function {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Collections.singletonList((ContextTrack) obj);
    }
}
