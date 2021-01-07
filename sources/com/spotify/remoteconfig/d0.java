package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidGoogleClockProperties;
import com.spotify.remoteconfig.qe;

public final /* synthetic */ class d0 implements o0e {
    public static final /* synthetic */ d0 a = new d0();

    private /* synthetic */ d0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidGoogleClockProperties.GoogleClockTestContent googleClockTestContent = AndroidGoogleClockProperties.GoogleClockTestContent.WAKE;
        qe.b bVar = new qe.b();
        bVar.b(googleClockTestContent);
        bVar.b((AndroidGoogleClockProperties.GoogleClockTestContent) p0e.b("android-google-clock", "google_clock_test_content", googleClockTestContent));
        return bVar.a();
    }
}
