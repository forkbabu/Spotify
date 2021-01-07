package com.spotify.feature.speakerdeeplink;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;

public final /* synthetic */ class g implements c {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        GaiaDevice gaiaDevice = (GaiaDevice) obj2;
        if (!playerState.isPlaying() || playerState.isPaused()) {
            return Optional.of(gaiaDevice);
        }
        return Optional.absent();
    }
}
