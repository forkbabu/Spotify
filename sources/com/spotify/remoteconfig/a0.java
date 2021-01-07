package com.spotify.remoteconfig;

import com.spotify.remoteconfig.kd;

public final /* synthetic */ class a0 implements o0e {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-browse", "enable_encore_genre_hub_header", false);
        boolean a3 = p0e.a("android-feature-browse", "enable_new_find_header_in_browse", false);
        boolean a4 = p0e.a("android-feature-browse", "use_new_find_card_only", false);
        kd.b bVar = new kd.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.a();
    }
}
