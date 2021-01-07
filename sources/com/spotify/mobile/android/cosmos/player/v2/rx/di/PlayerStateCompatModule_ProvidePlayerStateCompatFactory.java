package com.spotify.mobile.android.cosmos.player.v2.rx.di;

import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import io.reactivex.y;

public final class PlayerStateCompatModule_ProvidePlayerStateCompatFactory implements fjf<PlayerStateCompat> {
    private final wlf<y> computationSchedulerProvider;
    private final wlf<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wlf<RxPlayerState> wlf, wlf<y> wlf2) {
        this.rxPlayerStateProvider = wlf;
        this.computationSchedulerProvider = wlf2;
    }

    public static PlayerStateCompatModule_ProvidePlayerStateCompatFactory create(wlf<RxPlayerState> wlf, wlf<y> wlf2) {
        return new PlayerStateCompatModule_ProvidePlayerStateCompatFactory(wlf, wlf2);
    }

    public static PlayerStateCompat providePlayerStateCompat(RxPlayerState rxPlayerState, y yVar) {
        return new PlayerStateCompat(rxPlayerState, yVar);
    }

    @Override // defpackage.wlf
    public PlayerStateCompat get() {
        return providePlayerStateCompat(this.rxPlayerStateProvider.get(), this.computationSchedulerProvider.get());
    }
}
