package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ui;

public final /* synthetic */ class f4 implements o0e {
    public static final /* synthetic */ f4 a = new f4();

    private /* synthetic */ f4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("partner-account-linking", "account_link_using_auth_code", false);
        boolean a3 = p0e.a("partner-account-linking", "enable_partner_account_linking_dialog", false);
        ui.b bVar = new ui.b();
        bVar.a(false);
        bVar.c(false);
        bVar.a(a2);
        bVar.c(a3);
        return bVar.b();
    }
}
