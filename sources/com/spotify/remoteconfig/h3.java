package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties;
import com.spotify.remoteconfig.jh;

public final /* synthetic */ class h3 implements o0e {
    public static final /* synthetic */ h3 a = new h3();

    private /* synthetic */ h3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-your-episodes-flags", "auto_add_downloaded_episodes_enabled", false);
        AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload enableContextDownload = AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload.DISABLED;
        boolean a3 = p0e.a("android-libs-your-episodes-flags", "enable_download_all", false);
        boolean a4 = p0e.a("android-libs-your-episodes-flags", "enable_recently_played", false);
        boolean a5 = p0e.a("android-libs-your-episodes-flags", "enable_tooltip", false);
        AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes enableYourEpisodes = AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes.DISABLED;
        boolean a6 = p0e.a("android-libs-your-episodes-flags", "rollout_new_player_api_in_your_episodes", false);
        jh.b bVar = new jh.b();
        bVar.a(false);
        bVar.c(enableContextDownload);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.g(enableYourEpisodes);
        bVar.h(false);
        bVar.a(a2);
        bVar.c((AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload) p0e.b("android-libs-your-episodes-flags", "enable_context_download", enableContextDownload));
        bVar.d(a3);
        bVar.e(a4);
        bVar.f(a5);
        bVar.g((AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes) p0e.b("android-libs-your-episodes-flags", "enable_your_episodes", enableYourEpisodes));
        bVar.h(a6);
        return bVar.b();
    }
}
