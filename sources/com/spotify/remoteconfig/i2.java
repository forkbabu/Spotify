package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureDrivingJumpstartProperties;
import com.spotify.remoteconfig.od;

public final /* synthetic */ class i2 implements o0e {
    public static final /* synthetic */ i2 a = new i2();

    private /* synthetic */ i2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback drivingCarViewNpvHoldback = AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback.ENABLED;
        od.b bVar = new od.b();
        bVar.b(drivingCarViewNpvHoldback);
        bVar.b((AndroidFeatureDrivingJumpstartProperties.DrivingCarViewNpvHoldback) p0e.b("android-feature-driving-jumpstart", "driving_car_view_npv_holdback", drivingCarViewNpvHoldback));
        return bVar.a();
    }
}
