package com.spotify.remoteconfig;

import com.spotify.remoteconfig.gd;

public final /* synthetic */ class m0 implements o0e {
    public static final /* synthetic */ m0 a = new m0();

    private /* synthetic */ m0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-alarm-warmup", "prelaunch_enabled", false);
        gd.b bVar = new gd.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
