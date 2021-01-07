package com.spotify.remoteconfig;

import com.spotify.remoteconfig.de;

public final /* synthetic */ class n implements o0e {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-podcast-episodetranscript", "episode_transcript_enabled", false);
        boolean a3 = p0e.a("android-feature-podcast-episodetranscript", "episode_transcript_metadata_enabled", false);
        de.b bVar = new de.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
