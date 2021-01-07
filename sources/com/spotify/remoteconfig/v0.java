package com.spotify.remoteconfig;

import com.spotify.remoteconfig.MusicLibsPageloaderForMusicProperties;
import com.spotify.remoteconfig.si;

public final /* synthetic */ class v0 implements o0e {
    public static final /* synthetic */ v0 a = new v0();

    private /* synthetic */ v0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy pageLoaderScopePolicy = MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy.START_STOP;
        si.b bVar = new si.b();
        bVar.b(pageLoaderScopePolicy);
        bVar.b((MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy) p0e.b("music-libs-pageloader-for-music", "page_loader_scope_policy", pageLoaderScopePolicy));
        return bVar.a();
    }
}
