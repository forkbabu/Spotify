package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.AndroidLibsNewplayingScrollWidgetsBtlProperties;

public class j implements a {
    private final lk2 a;
    private final AndroidLibsNewplayingScrollWidgetsBtlProperties b;

    public j(lk2 lk2, AndroidLibsNewplayingScrollWidgetsBtlProperties androidLibsNewplayingScrollWidgetsBtlProperties) {
        this.a = lk2;
        this.b = androidLibsNewplayingScrollWidgetsBtlProperties;
    }

    @Override // com.spotify.music.newplaying.scroll.a
    public boolean a(PlayerState playerState) {
        ContextTrack contextTrack = playerState.track().get();
        if (this.a.a(contextTrack)) {
            boolean c = lcb.c(contextTrack);
            int ordinal = this.b.a().ordinal();
            if (ordinal != 0 ? ordinal != 1 ? !c : true : false) {
                return true;
            }
        }
        return false;
    }
}
