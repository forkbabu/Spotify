package com.spotify.remoteconfig;

import com.spotify.remoteconfig.vf;

public final /* synthetic */ class t1 implements o0e {
    public static final /* synthetic */ t1 a = new t1();

    private /* synthetic */ t1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-nowplaying-scroll-widgets-podcast-more-for-you", "podcast_more_for_you_enabled", false);
        boolean a3 = p0e.a("android-libs-nowplaying-scroll-widgets-podcast-more-for-you", "podcast_more_for_you_prod_enabled", false);
        vf.b bVar = new vf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
