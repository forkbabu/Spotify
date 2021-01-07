package com.spotify.music.features.connect.cast;

import com.google.android.gms.cast.CastDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;

/* access modifiers changed from: package-private */
public final class j {
    static DiscoveredDevice a(CastDevice castDevice) {
        if (castDevice == null) {
            return DiscoveredDevice.errorStatusDevice("null", DiscoveredDevice.DEVICE_FAILURE_UNKNOWN);
        }
        DiscoveredDevice.b bVar = new DiscoveredDevice.b(castDevice.I1(), castDevice.Q1(), "Google", castDevice.q2());
        boolean z = true;
        if (!castDevice.r2(4) || castDevice.r2(1)) {
            z = false;
        }
        bVar.c(z);
        bVar.e(castDevice.p2().getHostAddress());
        bVar.b(castDevice.r2(32));
        bVar.d(DiscoveredDevice.CLASS_JS_CAST);
        return bVar.a();
    }
}
