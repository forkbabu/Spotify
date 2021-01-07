package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ce;

public final /* synthetic */ class j3 implements o0e {
    public static final /* synthetic */ j3 a = new j3();

    private /* synthetic */ j3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-podcast-episode", "podcast_episode_html_description_enabled", true);
        boolean a3 = p0e.a("android-feature-podcast-episode", "podcast_episode_new_player_api_enabled", false);
        ce.b bVar = new ce.b();
        bVar.b(true);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
