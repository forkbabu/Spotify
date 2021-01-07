package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureNavigationProperties;
import com.spotify.remoteconfig.xd;

public final /* synthetic */ class r2 implements o0e {
    public static final /* synthetic */ r2 a = new r2();

    private /* synthetic */ r2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidFeatureNavigationProperties.EnableLabelRemoval enableLabelRemoval = AndroidFeatureNavigationProperties.EnableLabelRemoval.DISABLED;
        boolean a2 = p0e.a("android-feature-navigation", "show_premium_label", true);
        xd.b bVar = new xd.b();
        bVar.b(enableLabelRemoval);
        bVar.c(true);
        bVar.b((AndroidFeatureNavigationProperties.EnableLabelRemoval) p0e.b("android-feature-navigation", "enable_label_removal", enableLabelRemoval));
        bVar.c(a2);
        return bVar.a();
    }
}
