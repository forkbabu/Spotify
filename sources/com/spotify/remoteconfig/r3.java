package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;
import com.spotify.remoteconfig.id;

public final /* synthetic */ class r3 implements o0e {
    public static final /* synthetic */ r3 a = new r3();

    private /* synthetic */ r3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidFeatureAllboardingProperties.EnableAllboarding enableAllboarding = AndroidFeatureAllboardingProperties.EnableAllboarding.ENABLED;
        id.b bVar = new id.b();
        bVar.b(enableAllboarding);
        bVar.b((AndroidFeatureAllboardingProperties.EnableAllboarding) p0e.b("android-feature-allboarding", "enable_allboarding", enableAllboarding));
        return bVar.a();
    }
}
