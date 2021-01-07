package com.spotify.remoteconfig;

import com.spotify.remoteconfig.le;

public final /* synthetic */ class g2 implements o0e {
    public static final /* synthetic */ g2 a = new g2();

    private /* synthetic */ g2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-spotify-go", "spotify_go_access_control", true);
        boolean a3 = p0e.a("android-feature-spotify-go", "spotify_go_bose_enabled", true);
        boolean a4 = p0e.a("android-feature-spotify-go", "spotify_go_connected_tts_enabled", false);
        boolean a5 = p0e.a("android-feature-spotify-go", "spotify_go_debug_toasts_enabled", false);
        boolean a6 = p0e.a("android-feature-spotify-go", "spotify_go_feature_enabled", true);
        boolean a7 = p0e.a("android-feature-spotify-go", "spotify_go_ikea_enabled", true);
        boolean a8 = p0e.a("android-feature-spotify-go", "spotify_go_jbl_enabled", true);
        boolean a9 = p0e.a("android-feature-spotify-go", "spotify_go_microsoft_enabled", true);
        boolean a10 = p0e.a("android-feature-spotify-go", "spotify_go_user_logged_out_tts_enabled", false);
        le.b bVar = new le.b();
        bVar.b(true);
        bVar.c(true);
        bVar.d(false);
        bVar.e(false);
        bVar.f(true);
        bVar.g(true);
        bVar.h(true);
        bVar.i(true);
        bVar.j(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        bVar.g(a7);
        bVar.h(a8);
        bVar.i(a9);
        bVar.j(a10);
        return bVar.a();
    }
}
