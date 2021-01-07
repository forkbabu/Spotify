package com.spotify.remoteconfig;

import com.spotify.remoteconfig.zg;

public final /* synthetic */ class v4 implements o0e {
    public static final /* synthetic */ v4 a = new v4();

    private /* synthetic */ v4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-storylines", "enable_storylines", false);
        boolean a3 = p0e.a("android-libs-storylines", "use_context_track_extensions", false);
        zg.b bVar = new zg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
