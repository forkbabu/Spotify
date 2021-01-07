package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAdaptiveUiProperties;
import com.spotify.remoteconfig.we;

public final /* synthetic */ class i1 implements o0e {
    public static final /* synthetic */ i1 a = new i1();

    private /* synthetic */ i1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsAdaptiveUiProperties.EnableSidebarLayout enableSidebarLayout = AndroidLibsAdaptiveUiProperties.EnableSidebarLayout.DISABLED;
        we.b bVar = new we.b();
        bVar.b(enableSidebarLayout);
        bVar.b((AndroidLibsAdaptiveUiProperties.EnableSidebarLayout) p0e.b("android-libs-adaptive-ui", "enable_sidebar_layout", enableSidebarLayout));
        return bVar.a();
    }
}
