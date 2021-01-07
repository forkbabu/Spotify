package com.spotify.remoteconfig;

import com.spotify.remoteconfig.qf;

public final /* synthetic */ class v2 implements o0e {
    public static final /* synthetic */ v2 a = new v2();

    private /* synthetic */ v2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-nowplaying-common-views", "enable_adjusting_layout_for_foldables_in_flex_mode", false);
        boolean a3 = p0e.a("android-libs-nowplaying-common-views", "enable_subtitles_video_track_player", false);
        qf.b bVar = new qf.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
