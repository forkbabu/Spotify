package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ld;

public final /* synthetic */ class g implements o0e {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-car-mode-home", "car_mode_home_enabled", false);
        boolean a3 = p0e.a("android-feature-car-mode-home", "car_mode_offline_bar_enabled", false);
        boolean a4 = p0e.a("android-feature-car-mode-home", "navigation_partner_banners_suppressed", false);
        ld.b bVar = new ld.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.a();
    }
}
