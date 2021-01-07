package com.spotify.music.features.connectui.picker.frictionlessjoin.model;

import kotlin.jvm.internal.h;

public final class c {
    private final String a;
    private final DeviceExposureStatus b;

    public c(String str, DeviceExposureStatus deviceExposureStatus) {
        h.e(str, "deviceId");
        h.e(deviceExposureStatus, "exposureStatus");
        this.a = str;
        this.b = deviceExposureStatus;
    }

    public final DeviceExposureStatus a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && h.a(this.b, cVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DeviceExposureStatus deviceExposureStatus = this.b;
        if (deviceExposureStatus != null) {
            i = deviceExposureStatus.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DeviceExposureResponse(deviceId=");
        V0.append(this.a);
        V0.append(", exposureStatus=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
