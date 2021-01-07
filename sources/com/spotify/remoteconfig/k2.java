package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ne;

public final /* synthetic */ class k2 implements o0e {
    public static final /* synthetic */ k2 a = new k2();

    private /* synthetic */ k2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        int c = p0e.c("android-feature-video", "video_download_bitrate", 200000, 3000000, 800000);
        boolean a2 = p0e.a("android-feature-video", "video_offline_check_disk_space_enabled", false);
        boolean a3 = p0e.a("android-feature-video", "video_offline_enabled", false);
        boolean a4 = p0e.a("android-feature-video", "video_offline_subtitles_enabled", false);
        ne.b bVar = new ne.b();
        bVar.b(800000);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.b(c);
        bVar.c(a2);
        bVar.d(a3);
        bVar.e(a4);
        z6 a5 = bVar.a();
        if (a5.a() >= 200000 && a5.a() <= 3000000) {
            return a5;
        }
        throw new IllegalArgumentException("Value for videoDownloadBitrate() out of bounds");
    }
}
