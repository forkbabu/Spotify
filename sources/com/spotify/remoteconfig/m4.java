package com.spotify.remoteconfig;

import com.spotify.remoteconfig.sg;

public final /* synthetic */ class m4 implements o0e {
    public static final /* synthetic */ m4 a = new m4();

    private /* synthetic */ m4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-share-impl", "deeplink_open_log_all_deeplinks", false);
        boolean a3 = p0e.a("android-libs-share-impl", "enable_backend_generated_share_url", false);
        boolean a4 = p0e.a("android-libs-share-impl", "enable_deeplink_open_logging", true);
        boolean a5 = p0e.a("android-libs-share-impl", "enable_fb_video_sharing", false);
        boolean a6 = p0e.a("android-libs-share-impl", "enable_ig_video_sharing", true);
        boolean a7 = p0e.a("android-libs-share-impl", "enable_utm_sources", false);
        boolean a8 = p0e.a("android-libs-share-impl", "share_concerts_to_stories", false);
        boolean a9 = p0e.a("android-libs-share-impl", "show_share_menu_v2", false);
        boolean a10 = p0e.a("android-libs-share-impl", "show_updated_icons_in_share_menu_v2", false);
        sg.b bVar = new sg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(true);
        bVar.e(false);
        bVar.f(true);
        bVar.g(false);
        bVar.h(false);
        bVar.i(false);
        bVar.j(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        bVar.g(a7);
        bVar.h(a8);
        bVar.i(a9);
        bVar.j(a10);
        return bVar.a();
    }
}
