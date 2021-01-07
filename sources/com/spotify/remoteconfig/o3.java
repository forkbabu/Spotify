package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yd;

public final /* synthetic */ class o3 implements o0e {
    public static final /* synthetic */ o3 a = new o3();

    private /* synthetic */ o3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-nowplayingbar", "enable_color_extraction", false);
        boolean a3 = p0e.a("android-feature-nowplayingbar", "enable_floating_npb", false);
        yd.b bVar = new yd.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
