package com.spotify.remoteconfig;

import com.spotify.remoteconfig.wf;

public final /* synthetic */ class e3 implements o0e {
    public static final /* synthetic */ e3 a = new e3();

    private /* synthetic */ e3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-nowplaying-scroll-widgets-up-next", "upnext_queue_enabled", false);
        boolean a3 = p0e.a("android-libs-nowplaying-scroll-widgets-up-next", "upnext_queue_prod_enabled", false);
        wf.b bVar = new wf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
