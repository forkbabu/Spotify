package com.spotify.remoteconfig;

import com.spotify.remoteconfig.rg;

public final /* synthetic */ class c1 implements o0e {
    public static final /* synthetic */ c1 a = new c1();

    private /* synthetic */ c1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-serviceforegroundstarter", "always_show_background_start_notification", true);
        rg.b bVar = new rg.b();
        bVar.a(true);
        bVar.a(a2);
        return bVar.b();
    }
}
