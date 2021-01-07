package com.spotify.remoteconfig;

import com.spotify.remoteconfig.oh;

public final /* synthetic */ class u1 implements o0e {
    public static final /* synthetic */ u1 a = new u1();

    private /* synthetic */ u1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-media-resumption", "enable_media_resumption", false);
        oh.b bVar = new oh.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
