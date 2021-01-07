package com.spotify.remoteconfig;

import com.spotify.remoteconfig.gg;

public final /* synthetic */ class h2 implements o0e {
    public static final /* synthetic */ h2 a = new h2();

    private /* synthetic */ h2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-entity-modes-p2s", "dont_open_now_playing_view_on_video_playback", false);
        boolean a3 = p0e.a("android-libs-playlist-entity-modes-p2s", "show_refresh_header_instead_of_p2s_header", false);
        gg.b bVar = new gg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
