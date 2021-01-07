package com.spotify.remoteconfig;

import com.spotify.remoteconfig.sh;

public final /* synthetic */ class j4 implements o0e {
    public static final /* synthetic */ j4 a = new j4();

    private /* synthetic */ j4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-music-libs-instrumentation-navigation-logger-integration", "enable_navigation_logger_event_sending", false);
        sh.b bVar = new sh.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
