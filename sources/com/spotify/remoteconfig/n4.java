package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeaturePremiumHubProperties;
import com.spotify.remoteconfig.ge;

public final /* synthetic */ class n4 implements o0e {
    public static final /* synthetic */ n4 a = new n4();

    private /* synthetic */ n4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidFeaturePremiumHubProperties.PremiumHubPhase2 premiumHubPhase2 = AndroidFeaturePremiumHubProperties.PremiumHubPhase2.CONTROL;
        ge.b bVar = new ge.b();
        bVar.b(premiumHubPhase2);
        bVar.b((AndroidFeaturePremiumHubProperties.PremiumHubPhase2) p0e.b("android-feature-premium-hub", "premium_hub_phase_2", premiumHubPhase2));
        return bVar.a();
    }
}
