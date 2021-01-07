package com.spotify.music.autoplay;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public class b0 implements l<PlayerState, Boolean> {
    private final wlf<Boolean> a;

    public b0(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    /* renamed from: a */
    public Boolean apply(PlayerState playerState) {
        Boolean bool = Boolean.FALSE;
        if (ViewUris.s.a(playerState.contextUri()) || ViewUris.c2.a(playerState.contextUri()) || ViewUris.r0.a(playerState.contextUri())) {
            return bool;
        }
        String str = playerState.contextMetadata().get(Context.Metadata.KEY_AUTOPLAY_CANDIDATE);
        if (str == null || Boolean.valueOf(str).booleanValue()) {
            return this.a.get();
        }
        Logger.b("%s marked as NOT eligible for autoplay", playerState.contextUri());
        return bool;
    }
}
