package com.spotify.mobile.android.cosmos.player.v2.rx;

import io.reactivex.y;

public final class PlayerStateCompat_Factory implements fjf<PlayerStateCompat> {
    private final wlf<y> computationSchedulerProvider;
    private final wlf<RxPlayerState> rxPlayerStateProvider;

    public PlayerStateCompat_Factory(wlf<RxPlayerState> wlf, wlf<y> wlf2) {
        this.rxPlayerStateProvider = wlf;
        this.computationSchedulerProvider = wlf2;
    }

    public static PlayerStateCompat_Factory create(wlf<RxPlayerState> wlf, wlf<y> wlf2) {
        return new PlayerStateCompat_Factory(wlf, wlf2);
    }

    public static PlayerStateCompat newInstance(RxPlayerState rxPlayerState, y yVar) {
        return new PlayerStateCompat(rxPlayerState, yVar);
    }

    @Override // defpackage.wlf
    public PlayerStateCompat get() {
        return newInstance(this.rxPlayerStateProvider.get(), this.computationSchedulerProvider.get());
    }
}
