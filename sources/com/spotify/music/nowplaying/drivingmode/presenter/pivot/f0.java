package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.a0;

public final /* synthetic */ class f0 implements Player.PlayerStateObserver {
    public final /* synthetic */ a0 a;

    public /* synthetic */ f0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
    public final void onPlayerStateReceived(LegacyPlayerState legacyPlayerState) {
        this.a.onSuccess(legacyPlayerState);
    }
}
