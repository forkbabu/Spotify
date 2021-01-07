package com.spotify.remoteconfig;

import com.spotify.remoteconfig.gi;

public final /* synthetic */ class i3 implements o0e {
    public static final /* synthetic */ i3 a = new i3();

    private /* synthetic */ i3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("arch-california", "enable_california", false);
        boolean a3 = p0e.a("arch-california", "enable_parameterless_california", false);
        gi.b bVar = new gi.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
