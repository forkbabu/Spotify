package com.spotify.remoteconfig;

import com.spotify.remoteconfig.pd;

public final /* synthetic */ class e implements o0e {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-edit-playlist", "annotations", false);
        boolean a3 = p0e.a("android-feature-edit-playlist", "show_track_list_for_nft_users", false);
        boolean a4 = p0e.a("android-feature-edit-playlist", "use_shimmering", false);
        pd.b bVar = new pd.b();
        bVar.a(false);
        bVar.c(false);
        bVar.d(false);
        bVar.a(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.b();
    }
}
