package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ Player.PlayerStateObserver a;

    public /* synthetic */ a(Player.PlayerStateObserver playerStateObserver) {
        this.a = playerStateObserver;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onPlayerStateReceived((LegacyPlayerState) obj);
    }
}
