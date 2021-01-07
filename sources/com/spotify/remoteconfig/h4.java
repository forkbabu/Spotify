package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;
import com.spotify.remoteconfig.xf;

public final /* synthetic */ class h4 implements o0e {
    public static final /* synthetic */ h4 a = new h4();

    private /* synthetic */ h4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsOfflineTrialsProperties.OfflineDailyCap offlineDailyCap = AndroidLibsOfflineTrialsProperties.OfflineDailyCap.CONTROL;
        boolean a2 = p0e.a("android-libs-offline-trials", "spotify_curated_offline_mix_enabled", false);
        boolean a3 = p0e.a("android-libs-offline-trials", "user_curated_offline_mix_enabled", false);
        xf.b bVar = new xf.b();
        bVar.b(offlineDailyCap);
        bVar.c(false);
        bVar.d(false);
        bVar.b((AndroidLibsOfflineTrialsProperties.OfflineDailyCap) p0e.b("android-libs-offline-trials", "offline_daily_cap", offlineDailyCap));
        bVar.c(a2);
        bVar.d(a3);
        return bVar.a();
    }
}
