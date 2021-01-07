package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.service.plugininterfaces.b;

public class l2 implements b {
    private final y2 a;

    l2(y2 y2Var) {
        this.a = y2Var;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "ExternalIntegrationService";
    }
}
