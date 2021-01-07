package com.spotify.libs.connect.providers;

import com.google.common.collect.Collections2;
import com.spotify.libs.connect.model.GaiaState;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z;
        GaiaState gaiaState = (GaiaState) obj;
        if (gaiaState.isActive().booleanValue()) {
            z = false;
        } else {
            z = Collections2.any(gaiaState.getDevices(), f.a);
        }
        return Boolean.valueOf(z);
    }
}
