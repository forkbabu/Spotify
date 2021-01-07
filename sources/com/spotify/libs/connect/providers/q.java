package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

final class q<T> implements n<GaiaDevice> {
    public static final q a = new q();

    q() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(GaiaDevice gaiaDevice) {
        GaiaDevice gaiaDevice2 = gaiaDevice;
        h.e(gaiaDevice2, "it");
        return gaiaDevice2.isSelf();
    }
}
