package com.spotify.remoteconfig;

import com.spotify.remoteconfig.jg;

public final /* synthetic */ class k3 implements o0e {
    public static final /* synthetic */ k3 a = new k3();

    private /* synthetic */ k3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-podcast-endpoints", "embedded_segments_enabled", false);
        boolean a3 = p0e.a("android-libs-podcast-endpoints", "playback_segments_enabled", true);
        jg.b bVar = new jg.b();
        bVar.b(false);
        bVar.c(true);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
