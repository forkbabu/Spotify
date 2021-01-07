package com.spotify.remoteconfig;

import com.spotify.remoteconfig.dg;

public final /* synthetic */ class c implements o0e {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-entity-modes-editorial", "enable_editorial_playlist_entity_mode", false);
        boolean a3 = p0e.a("android-libs-playlist-entity-modes-editorial", "enable_track_context_sharing", false);
        dg.b bVar = new dg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
