package com.spotify.remoteconfig;

import com.spotify.remoteconfig.xg;

public final /* synthetic */ class t implements o0e {
    public static final /* synthetic */ t a = new t();

    private /* synthetic */ t() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-sso", "enable_pkce", false);
        xg.b bVar = new xg.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
