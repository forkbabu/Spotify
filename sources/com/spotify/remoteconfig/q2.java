package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;
import com.spotify.remoteconfig.nh;

public final /* synthetic */ class q2 implements o0e {
    public static final /* synthetic */ q2 a = new q2();

    private /* synthetic */ q2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck bypassAuthHadoukenWithInitCheck = AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck.NOT_INITIALIZED;
        boolean a2 = p0e.a("android-media-browser-service", "enable_auth_for_mbs", false);
        nh.b bVar = new nh.b();
        bVar.b(bypassAuthHadoukenWithInitCheck);
        bVar.c(false);
        bVar.b((AndroidMediaBrowserServiceProperties.BypassAuthHadoukenWithInitCheck) p0e.b("android-media-browser-service", "bypass_auth_hadouken_with_init_check", bypassAuthHadoukenWithInitCheck));
        bVar.c(a2);
        return bVar.a();
    }
}
