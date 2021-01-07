package com.spotify.remoteconfig;

import com.spotify.remoteconfig.eh;

public final /* synthetic */ class t0 implements o0e {
    public static final /* synthetic */ t0 a = new t0();

    private /* synthetic */ t0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-voice-common", "voice_enable_feature", false);
        boolean a3 = p0e.a("android-libs-voice-common", "voice_enable_language_expansion", false);
        eh.b bVar = new eh.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
