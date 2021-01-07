package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ri;

public final /* synthetic */ class c0 implements o0e {
    public static final /* synthetic */ c0 a = new c0();

    private /* synthetic */ c0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        int c = p0e.c("music-libs-image-resolve-for-music", "image_resolve_configuration_ttl_sec", 0, 5356800, 1209600);
        boolean a2 = p0e.a("music-libs-image-resolve-for-music", "image_resolve_enabled", false);
        ri.b bVar = new ri.b();
        bVar.c(1209600);
        bVar.d(false);
        bVar.c(c);
        bVar.d(a2);
        return bVar.b();
    }
}
