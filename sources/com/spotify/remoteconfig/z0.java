package com.spotify.remoteconfig;

import com.spotify.remoteconfig.cg;

public final /* synthetic */ class z0 implements o0e {
    public static final /* synthetic */ z0 a = new z0();

    private /* synthetic */ z0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-entity-modes-charts", "enable_encore_trackrowcharts", false);
        boolean a3 = p0e.a("android-libs-playlist-entity-modes-charts", "show_refresh_header_instead_of_playlist_header", false);
        cg.b bVar = new cg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
