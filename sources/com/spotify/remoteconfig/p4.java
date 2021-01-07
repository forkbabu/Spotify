package com.spotify.remoteconfig;

import com.spotify.remoteconfig.mi;

public final /* synthetic */ class p4 implements o0e {
    public static final /* synthetic */ p4 a = new p4();

    private /* synthetic */ p4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("connect-ui-v2", "connect_mini_picker", false);
        boolean a3 = p0e.a("connect-ui-v2", "connect_mini_picker_device_sorting", false);
        boolean a4 = p0e.a("connect-ui-v2", "connect_redesigned_picker", false);
        mi.b bVar = new mi.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        return bVar.a();
    }
}
