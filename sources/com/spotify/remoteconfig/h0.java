package com.spotify.remoteconfig;

import com.spotify.remoteconfig.pe;

public final /* synthetic */ class h0 implements o0e {
    public static final /* synthetic */ h0 a = new h0();

    private /* synthetic */ h0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-freetier-experiments", "should_show_premium_badge", false);
        pe.b bVar = new pe.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
