package com.spotify.remoteconfig;

import com.spotify.remoteconfig.zf;

public final /* synthetic */ class j0 implements o0e {
    public static final /* synthetic */ j0 a = new j0();

    private /* synthetic */ j0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-onboarding", "enable_skip_limit_upsell_dialog", false);
        zf.b bVar = new zf.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
