package com.spotify.libs.connect.model;

import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import java.util.Collections;
import java.util.List;

public final class c {
    private String a;
    private String b;
    private String c;
    private DeviceState.GaiaDeviceState d;
    private DeviceType.GaiaTypes e;
    private List<GaiaDeviceIncarnation> f = Collections.emptyList();
    private List<GaiaDeviceCapability> g = Collections.emptyList();

    private c(String str, String str2, DeviceState.GaiaDeviceState gaiaDeviceState, DeviceType.GaiaTypes gaiaTypes) {
        this.a = str2;
        this.b = str2;
        this.c = str;
        this.d = gaiaDeviceState;
        this.e = gaiaTypes;
    }

    public static c b(String str, String str2, DeviceState.GaiaDeviceState gaiaDeviceState, DeviceType.GaiaTypes gaiaTypes) {
        return new c(str, str2, gaiaDeviceState, gaiaTypes);
    }

    public GaiaDevice a() {
        GaiaDevice gaiaDevice = new GaiaDevice(false, false, false, false, true, false, true, false, false, false, true, false, 0, "UNKNOWN", "UNKNOWN", this.a, this.b, this.c, this.d, this.e, this.f, 0, "", true, false, this.g, 0, false);
        gaiaDevice.setFrictionlessJoinData(null);
        return gaiaDevice;
    }
}
