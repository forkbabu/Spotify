package com.spotify.feature.speakerdeeplink;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;

public final /* synthetic */ class k implements n {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((GaiaDevice) obj).isActive();
    }
}
