package com.spotify.libs.connect.providers;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class i<T, R> implements l<GaiaDevice, Optional<GaiaDevice>> {
    public static final i a = new i();

    i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<GaiaDevice> apply(GaiaDevice gaiaDevice) {
        GaiaDevice gaiaDevice2 = gaiaDevice;
        h.e(gaiaDevice2, "it");
        return Optional.of(gaiaDevice2);
    }
}
