package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ki;

public final /* synthetic */ class c2 implements o0e {
    public static final /* synthetic */ c2 a = new c2();

    private /* synthetic */ c2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("connect-lib-core", "connect_frictionless_join", false);
        boolean a3 = p0e.a("connect-lib-core", "connect_keeps_alive", false);
        boolean a4 = p0e.a("connect-lib-core", "connect_lock_screen_volume", false);
        boolean a5 = p0e.a("connect-lib-core", "connect_m2m", false);
        boolean a6 = p0e.a("connect-lib-core", "connect_new_cast_api", false);
        ki.b bVar = new ki.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        return bVar.a();
    }
}
