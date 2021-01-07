package com.spotify.remoteconfig;

import com.spotify.remoteconfig.md;

public final /* synthetic */ class p3 implements o0e {
    public static final /* synthetic */ p3 a = new p3();

    private /* synthetic */ p3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-car-mode-navigation", "car_mode_navigation_bar_enabled", false);
        boolean a3 = p0e.a("android-feature-car-mode-navigation", "car_mode_navigation_bar_regular_search_enabled", false);
        md.b bVar = new md.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
