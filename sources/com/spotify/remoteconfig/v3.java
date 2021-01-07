package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ie;

public final /* synthetic */ class v3 implements o0e {
    public static final /* synthetic */ v3 a = new v3();

    private /* synthetic */ v3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-profile", "change_photo_enabled", false);
        boolean a3 = p0e.a("android-feature-profile", "edit_profile_enabled", false);
        boolean a4 = p0e.a("android-feature-profile", "new_profile_page_enabled", false);
        boolean a5 = p0e.a("android-feature-profile", "old_profile_page_enabled", true);
        boolean a6 = p0e.a("android-feature-profile", "use_page_api", false);
        ie.b bVar = new ie.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.e(true);
        bVar.f(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        return bVar.a();
    }
}
