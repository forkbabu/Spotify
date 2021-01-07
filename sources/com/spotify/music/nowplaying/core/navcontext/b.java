package com.spotify.music.nowplaying.core.navcontext;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class b implements Function {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return MoreObjects.nullToEmpty(((ContextTrack) obj).metadata().get(this.a));
    }
}
