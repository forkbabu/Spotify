package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import defpackage.bob;

public final /* synthetic */ class p implements ti0 {
    public final /* synthetic */ Optional a;
    public final /* synthetic */ PlayerState b;

    public /* synthetic */ p(Optional optional, PlayerState playerState) {
        this.a = optional;
        this.b = playerState;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return cob.b(((bob.b) obj).e(), this.a, this.b.playbackId());
    }
}
