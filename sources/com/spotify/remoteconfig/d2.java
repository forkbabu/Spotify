package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsCarDetectionProperties;
import com.spotify.remoteconfig.cf;

public final /* synthetic */ class d2 implements o0e {
    public static final /* synthetic */ d2 a = new d2();

    private /* synthetic */ d2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsCarDetectionProperties.CarDetectionIsEnabled carDetectionIsEnabled = AndroidLibsCarDetectionProperties.CarDetectionIsEnabled.ENABLED;
        cf.b bVar = new cf.b();
        bVar.b(carDetectionIsEnabled);
        bVar.b((AndroidLibsCarDetectionProperties.CarDetectionIsEnabled) p0e.b("android-libs-car-detection", "car_detection_is_enabled", carDetectionIsEnabled));
        return bVar.a();
    }
}
