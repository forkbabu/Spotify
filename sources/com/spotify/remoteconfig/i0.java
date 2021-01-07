package com.spotify.remoteconfig;

import com.spotify.remoteconfig.th;

public final /* synthetic */ class i0 implements o0e {
    public static final /* synthetic */ i0 a = new i0();

    private /* synthetic */ i0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-music-libs-moderation", "moderation_artist_profile_rollout_android", false);
        boolean a3 = p0e.a("android-music-libs-moderation", "moderation_rollout_android", false);
        th.b bVar = new th.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
