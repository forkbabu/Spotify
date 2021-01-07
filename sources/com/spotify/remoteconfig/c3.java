package com.spotify.remoteconfig;

import com.spotify.remoteconfig.td;

public final /* synthetic */ class c3 implements o0e {
    public static final /* synthetic */ c3 a = new c3();

    private /* synthetic */ c3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-free-tier-track", "dummy_property_by_madprops", false);
        boolean a3 = p0e.a("android-feature-free-tier-track", "enable_skip_limit_upsell_dialog", false);
        td.b bVar = new td.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
