package com.spotify.mobile.android.video;

import com.spotify.mobile.android.video.l;

public final /* synthetic */ class a implements o0e {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("music-libs-video", "spotify_video_hls_enabled", false);
        boolean a3 = p0e.a("music-libs-video", "subtitles_enabled", false);
        l.b bVar = new l.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
