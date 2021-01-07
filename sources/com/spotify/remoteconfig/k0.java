package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ji;

public final /* synthetic */ class k0 implements o0e {
    public static final /* synthetic */ k0 a = new k0();

    private /* synthetic */ k0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("connect-flags", "connect_nudge", false);
        boolean a3 = p0e.a("connect-flags", "device_name_npb", false);
        ji.b bVar = new ji.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
