package com.spotify.remoteconfig;

import com.spotify.remoteconfig.bf;

public final /* synthetic */ class y3 implements o0e {
    public static final /* synthetic */ y3 a = new y3();

    private /* synthetic */ y3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-canvas-share", "enable_canvas_cta_margin", false);
        boolean a3 = p0e.a("android-libs-canvas-share", "enable_canvas_sharing_in_npv", false);
        bf.b bVar = new bf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
