package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yh;

public final /* synthetic */ class k implements o0e {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-music-libs-utterance-suggestions", "enable_utterance_suggestions_in_search", false);
        yh.b bVar = new yh.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
