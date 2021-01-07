package com.spotify.music.features.connectui.picker.legacy.util;

import com.google.common.collect.ImmutableSet;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.a;
import com.spotify.libs.connect.r;

public class b {
    private static final ImmutableSet<DeviceState> b = ImmutableSet.of(DeviceState.GaiaDeviceState.CONNECTING, DeviceState.GaiaDeviceState.LOGGED_IN);
    private static final ImmutableSet<DeviceType> c = ImmutableSet.of(DeviceType.GaiaTypes.COMPUTER, DeviceType.GaiaTypes.SMARTPHONE, DeviceType.GaiaTypes.TABLET);
    private final r a;

    public b(r rVar) {
        this.a = rVar;
    }

    public DeviceType a() {
        return this.a.a();
    }

    public boolean b(a aVar) {
        if (aVar.isDisabled()) {
            return false;
        }
        if (!(b.contains(aVar.getState()) && (c.contains(aVar.getType()) ^ true) && aVar.supportsLogout()) && !aVar.hasIncarnations()) {
            if (!(aVar.getCapabilities() != null && !aVar.getCapabilities().isEmpty())) {
                return false;
            }
        }
        return true;
    }
}
