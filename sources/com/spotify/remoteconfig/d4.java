package com.spotify.remoteconfig;

import com.adjust.sdk.Constants;
import com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties;
import com.spotify.remoteconfig.he;

public final /* synthetic */ class d4 implements o0e {
    public static final /* synthetic */ d4 a = new d4();

    private /* synthetic */ d4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidFeaturePremiumReactivationProperties.ContentProvider contentProvider = AndroidFeaturePremiumReactivationProperties.ContentProvider.WEBSITE;
        AndroidFeaturePremiumReactivationProperties.UserPolicy userPolicy = AndroidFeaturePremiumReactivationProperties.UserPolicy.CONTROL;
        he.b bVar = new he.b();
        bVar.b(contentProvider);
        bVar.c(userPolicy);
        bVar.b((AndroidFeaturePremiumReactivationProperties.ContentProvider) p0e.b("android-feature-premium-reactivation", Constants.CONTENT_PROVIDER, contentProvider));
        bVar.c((AndroidFeaturePremiumReactivationProperties.UserPolicy) p0e.b("android-feature-premium-reactivation", "user_policy", userPolicy));
        return bVar.a();
    }
}
