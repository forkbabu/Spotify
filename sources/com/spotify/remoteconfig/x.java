package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ue;

public final /* synthetic */ class x implements o0e {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-lib-quote-sharing", "episode_page_enabled", false);
        boolean a3 = p0e.a("android-lib-quote-sharing", "podcast_quotes", false);
        ue.b bVar = new ue.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
