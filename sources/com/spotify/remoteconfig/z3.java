package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ef;

public final /* synthetic */ class z3 implements o0e {
    public static final /* synthetic */ z3 a = new z3();

    private /* synthetic */ z3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-car-mode-nowplaying-modes", "car_mode_default_now_playing_enabled", false);
        ef.b bVar = new ef.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
