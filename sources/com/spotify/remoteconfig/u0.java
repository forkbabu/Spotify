package com.spotify.remoteconfig;

import com.spotify.remoteconfig.of;

public final /* synthetic */ class u0 implements o0e {
    public static final /* synthetic */ u0 a = new u0();

    private /* synthetic */ u0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-marquee", "enable_marquee", false);
        boolean a3 = p0e.a("android-libs-marquee", "suppress_impressions", false);
        of.b bVar = new of.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
