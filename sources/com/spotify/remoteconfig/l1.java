package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yf;

public final /* synthetic */ class l1 implements o0e {
    public static final /* synthetic */ l1 a = new l1();

    private /* synthetic */ l1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-on-demand-sharing", "disable_prerolls_for_on_demand_sharing", false);
        boolean a3 = p0e.a("android-libs-on-demand-sharing", "enable_on_demand_sharing", false);
        yf.b bVar = new yf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
