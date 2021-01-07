package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ s a;

    public /* synthetic */ d(s sVar) {
        this.a = sVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.b(this.a, (PlayerState) obj);
    }
}
