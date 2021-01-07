package com.spotify.remoteconfig;

import com.spotify.remoteconfig.pi;

public final /* synthetic */ class p1 implements o0e {
    public static final /* synthetic */ p1 a = new p1();

    private /* synthetic */ p1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("fetch-settings", "enable_download_preferred_resource_type", false);
        boolean a3 = p0e.a("fetch-settings", "enable_local_files_library", false);
        boolean a4 = p0e.a("fetch-settings", "enable_stream_non_metered_quality", false);
        pi.b bVar = new pi.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.a();
    }
}
