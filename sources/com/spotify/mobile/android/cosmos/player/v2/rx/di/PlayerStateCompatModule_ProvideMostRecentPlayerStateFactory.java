package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public final class PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory implements fjf<LegacyPlayerState> {
    private final wlf<PlayerStateCompat> playerStateCompatProvider;

    public PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wlf<PlayerStateCompat> wlf) {
        this.playerStateCompatProvider = wlf;
    }

    public static PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory create(wlf<PlayerStateCompat> wlf) {
        return new PlayerStateCompatModule_ProvideMostRecentPlayerStateFactory(wlf);
    }

    public static LegacyPlayerState provideMostRecentPlayerState(PlayerStateCompat playerStateCompat) {
        return playerStateCompat.getMostRecentPlayerState();
    }

    @Override // defpackage.wlf
    public LegacyPlayerState get() {
        return provideMostRecentPlayerState(this.playerStateCompatProvider.get());
    }
}
