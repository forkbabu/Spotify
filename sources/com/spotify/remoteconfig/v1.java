package com.spotify.remoteconfig;

import com.spotify.remoteconfig.lf;

public final /* synthetic */ class v1 implements o0e {
    public static final /* synthetic */ v1 a = new v1();

    private /* synthetic */ v1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-lyrics", "enable_lyrics_v2", false);
        boolean a3 = p0e.a("android-libs-lyrics", "enable_syllable_sync", false);
        lf.b bVar = new lf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
