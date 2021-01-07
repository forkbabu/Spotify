package com.spotify.music.libs.performance.tracking;

import com.spotify.mobile.android.service.plugininterfaces.b;

public class n implements b {
    private final m a;

    public n(m mVar) {
        this.a = mVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "ColdStartCosmosLink";
    }
}
