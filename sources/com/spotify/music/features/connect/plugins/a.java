package com.spotify.music.features.connect.plugins;

import com.google.common.base.Predicate;
import com.spotify.libs.connect.model.GaiaDevice;

public final /* synthetic */ class a implements Predicate {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        GaiaDevice gaiaDevice = (GaiaDevice) obj;
        return gaiaDevice != null && gaiaDevice.isActive() && !gaiaDevice.isSelf();
    }
}
