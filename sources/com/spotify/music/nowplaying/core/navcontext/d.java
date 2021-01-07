package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ j a;

    public /* synthetic */ d(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((PlayerState) obj);
    }
}
