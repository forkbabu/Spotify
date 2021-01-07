package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ f(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return u.b(this.a, (PlayerState) obj);
    }
}
