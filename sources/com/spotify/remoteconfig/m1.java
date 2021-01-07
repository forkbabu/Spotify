package com.spotify.remoteconfig;

import com.spotify.remoteconfig.dd;

public final /* synthetic */ class m1 implements o0e {
    public static final /* synthetic */ m1 a = new m1();

    private /* synthetic */ m1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-external-integration-loaders", "enable_entity_pages", false);
        boolean a3 = p0e.a("android-external-integration-loaders", "recommendations_proxy", false);
        dd.b bVar = new dd.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
