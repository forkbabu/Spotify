package com.spotify.libs.connect.providers;

import com.google.common.base.Predicate;
import com.spotify.libs.connect.model.GaiaDevice;

public final /* synthetic */ class f implements Predicate {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        return gaiaDevice != null && gaiaDevice.isActive() && !gaiaDevice.isSelf();
    }
}
