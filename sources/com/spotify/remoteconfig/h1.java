package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ag;

public final /* synthetic */ class h1 implements o0e {
    public static final /* synthetic */ h1 a = new h1();

    private /* synthetic */ h1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-endpoints", "always_show_windowed_tracks_in_playlists", false);
        ag.b bVar = new ag.b();
        bVar.a(false);
        bVar.a(a2);
        return bVar.b();
    }
}
