package com.spotify.remoteconfig;

import com.spotify.remoteconfig.je;

public final /* synthetic */ class a1 implements o0e {
    public static final /* synthetic */ a1 a = new a1();

    private /* synthetic */ a1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-queue", "clear_queue_button_enabled", false);
        boolean a3 = p0e.a("android-feature-queue", "enable_stable_ids", false);
        boolean a4 = p0e.a("android-feature-queue", "queue_v2", false);
        boolean a5 = p0e.a("android-feature-queue", "social_listening_in_queue", false);
        je.b bVar = new je.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        return bVar.a();
    }
}
