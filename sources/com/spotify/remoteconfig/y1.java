package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ii;

public final /* synthetic */ class y1 implements o0e {
    public static final /* synthetic */ y1 a = new y1();

    private /* synthetic */ y1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("boombox-settings", "enable_silence_trimmer_android", false);
        boolean a3 = p0e.a("boombox-settings", "limit_upwards_normalization", false);
        ii.b bVar = new ii.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
