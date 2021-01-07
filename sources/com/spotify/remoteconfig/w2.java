package com.spotify.remoteconfig;

import com.spotify.remoteconfig.lg;

public final /* synthetic */ class w2 implements o0e {
    public static final /* synthetic */ w2 a = new w2();

    private /* synthetic */ w2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-podcast-interactivity-qna", "show_qna_feature_in_episode_page", false);
        boolean a3 = p0e.a("android-libs-podcast-interactivity-qna", "show_qna_feature_in_npv", false);
        lg.b bVar = new lg.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
