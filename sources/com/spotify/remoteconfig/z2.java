package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties;
import com.spotify.remoteconfig.uh;

public final /* synthetic */ class z2 implements o0e {
    public static final /* synthetic */ z2 a = new z2();

    private /* synthetic */ z2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidMusicLibsNowplayingScrollProperties.DebugDataSource debugDataSource = AndroidMusicLibsNowplayingScrollProperties.DebugDataSource.CONTROL;
        uh.b bVar = new uh.b();
        bVar.b(debugDataSource);
        bVar.b((AndroidMusicLibsNowplayingScrollProperties.DebugDataSource) p0e.b("android-music-libs-nowplaying-scroll", "debug_data_source", debugDataSource));
        return bVar.a();
    }
}
