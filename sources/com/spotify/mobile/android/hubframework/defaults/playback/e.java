package com.spotify.mobile.android.hubframework.defaults.playback;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return ((String) playerState.track().transform(b.a).orNull()) + playerState.contextUri();
    }
}
