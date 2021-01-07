package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties;
import com.spotify.remoteconfig.rf;

public final /* synthetic */ class f0 implements o0e {
    public static final /* synthetic */ f0 a = new f0();

    private /* synthetic */ f0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView drivingDontLockWhenInCarView = AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView.ALWAYS_PREVENT_LOCKING;
        boolean a2 = p0e.a("android-libs-nowplaying-driving", "driving_enable_car_view_voice", false);
        rf.b bVar = new rf.b();
        bVar.b(drivingDontLockWhenInCarView);
        bVar.c(false);
        bVar.b((AndroidLibsNowplayingDrivingProperties.DrivingDontLockWhenInCarView) p0e.b("android-libs-nowplaying-driving", "driving_dont_lock_when_in_car_view", drivingDontLockWhenInCarView));
        bVar.c(a2);
        return bVar.a();
    }
}
