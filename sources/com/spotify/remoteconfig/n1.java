package com.spotify.remoteconfig;

import com.spotify.remoteconfig.wh;

public final /* synthetic */ class n1 implements o0e {
    public static final /* synthetic */ n1 a = new n1();

    private /* synthetic */ n1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-music-libs-playlist", "always_show_round_play_button", false);
        boolean a3 = p0e.a("android-music-libs-playlist", "hide_shuffle_badge_on_round_play_button", false);
        wh.b bVar = new wh.b();
        bVar.a(false);
        bVar.c(false);
        bVar.a(a2);
        bVar.c(a3);
        return bVar.b();
    }
}
