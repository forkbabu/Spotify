package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ae;

public final /* synthetic */ class j1 implements o0e {
    public static final /* synthetic */ j1 a = new j1();

    private /* synthetic */ j1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-playlist-entity", "support_personal_playlist_uris", false);
        boolean a3 = p0e.a("android-feature-playlist-entity", "use_shimmering", false);
        ae.b bVar = new ae.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
