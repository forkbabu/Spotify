package com.spotify.remoteconfig;

import com.spotify.remoteconfig.tg;

public final /* synthetic */ class i4 implements o0e {
    public static final /* synthetic */ i4 a = new i4();

    private /* synthetic */ i4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-share-root", "enable_backend_provided_share_destinations", false);
        tg.b bVar = new tg.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
