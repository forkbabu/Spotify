package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yi;

public final /* synthetic */ class r4 implements o0e {
    public static final /* synthetic */ r4 a = new r4();

    private /* synthetic */ r4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("skip-limit-pivot-to-ondemand", "enable_background_logging", false);
        boolean a3 = p0e.a("skip-limit-pivot-to-ondemand", "enable_background_notification", false);
        yi.b bVar = new yi.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
