package com.spotify.music.nowplaying.core.navcontext;

import com.google.common.base.Function;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(kxd.k((ContextTrack) obj));
    }
}
