package com.spotify.remoteconfig;

import com.spotify.remoteconfig.hf;

public final /* synthetic */ class o implements o0e {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-free-tier-track-preview", "enable_app_in_background_log", false);
        boolean a3 = p0e.a("android-libs-free-tier-track-preview", "enable_autoplay", false);
        hf.b bVar = new hf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
