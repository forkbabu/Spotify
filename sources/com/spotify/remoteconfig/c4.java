package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ve;

public final /* synthetic */ class c4 implements o0e {
    public static final /* synthetic */ c4 a = new c4();

    private /* synthetic */ c4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-account-linking-nudges", "enable_chromecast_filtering", false);
        boolean a3 = p0e.a("android-libs-account-linking-nudges", "enable_device_picker_linking", false);
        boolean a4 = p0e.a("android-libs-account-linking-nudges", "enable_google_assistant_linking", false);
        ve.b bVar = new ve.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.a();
    }
}
