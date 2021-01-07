package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties;
import com.spotify.remoteconfig.di;

public final /* synthetic */ class y0 implements o0e {
    public static final /* synthetic */ y0 a = new y0();

    private /* synthetic */ y0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("apps-music-features-remoteconfiguration", "button_big", false);
        AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor buttonColor = AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor.BLUE;
        AppsMusicFeaturesRemoteconfigurationProperties.Message message = AppsMusicFeaturesRemoteconfigurationProperties.Message.C_O_N_T_R_O_L;
        di.b bVar = new di.b();
        bVar.b(false);
        bVar.c(buttonColor);
        bVar.d(message);
        bVar.b(a2);
        bVar.c((AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor) p0e.b("apps-music-features-remoteconfiguration", "button_color", buttonColor));
        bVar.d((AppsMusicFeaturesRemoteconfigurationProperties.Message) p0e.b("apps-music-features-remoteconfiguration", "message", message));
        return bVar.a();
    }
}
