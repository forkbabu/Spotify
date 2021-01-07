package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

public final /* synthetic */ class n implements c {
    public final /* synthetic */ PlayerState a;

    public /* synthetic */ n(PlayerState playerState) {
        this.a = playerState;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return (cob) ((bob) obj).d(d.a, new p((Optional) obj2, this.a), t.a);
    }
}
