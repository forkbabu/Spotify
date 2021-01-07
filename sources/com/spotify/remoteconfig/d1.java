package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ee;

public final /* synthetic */ class d1 implements o0e {
    public static final /* synthetic */ d1 a = new d1();

    private /* synthetic */ d1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-podcast-featured-content", "podcast_cross_linking_enable", false);
        ee.b bVar = new ee.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
