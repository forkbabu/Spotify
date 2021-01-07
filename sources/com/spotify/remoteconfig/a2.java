package com.spotify.remoteconfig;

import com.spotify.remoteconfig.zi;

public final /* synthetic */ class a2 implements o0e {
    public static final /* synthetic */ a2 a = new a2();

    private /* synthetic */ a2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("update-email", "email_update_enabled", false);
        zi.b bVar = new zi.b();
        bVar.b(false);
        bVar.b(a2);
        return bVar.a();
    }
}
