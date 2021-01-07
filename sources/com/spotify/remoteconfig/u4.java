package com.spotify.remoteconfig;

import com.spotify.remoteconfig.mg;

public final /* synthetic */ class u4 implements o0e {
    public static final /* synthetic */ u4 a = new u4();

    private /* synthetic */ u4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-podcast-speedcontrol", "podcast_new_playback_speeds_enabled", true);
        boolean a3 = p0e.a("android-libs-podcast-speedcontrol", "podcast_three_point_5x_speed_enabled", true);
        mg.b bVar = new mg.b();
        bVar.b(true);
        bVar.c(true);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
