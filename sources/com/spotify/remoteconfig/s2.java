package com.spotify.remoteconfig;

import com.spotify.remoteconfig.rd;

public final /* synthetic */ class s2 implements o0e {
    public static final /* synthetic */ s2 a = new s2();

    private /* synthetic */ s2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-free-tier-artist", "enable_sort_and_filter_in_discography_page", false);
        rd.b bVar = new rd.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
