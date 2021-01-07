package com.spotify.remoteconfig;

import com.spotify.remoteconfig.dh;

public final /* synthetic */ class f3 implements o0e {
    public static final /* synthetic */ f3 a = new f3();

    private /* synthetic */ f3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-voice-api", "voice_enable_grpc", false);
        dh.b bVar = new dh.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
