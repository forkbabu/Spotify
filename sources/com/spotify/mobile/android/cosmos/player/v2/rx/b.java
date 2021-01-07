package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ PlayerStateCompat a;
    public final /* synthetic */ Player.PlayerStateObserver b;

    public /* synthetic */ b(PlayerStateCompat playerStateCompat, Player.PlayerStateObserver playerStateObserver) {
        this.a = playerStateCompat;
        this.b = playerStateObserver;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PlayerStateCompat playerStateCompat = this.a;
        Player.PlayerStateObserver playerStateObserver = this.b;
        playerStateCompat.getClass();
        Assertion.i(String.format("Leaked PlayerStateObserver: %s", playerStateObserver.getClass().getName()), (Throwable) obj);
        playerStateCompat.unsubscribe(playerStateObserver);
    }
}
