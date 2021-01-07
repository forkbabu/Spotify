package com.spotify.music.features.ads;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class m0 implements d {
    private final l0 a;

    public m0(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdSessionState";
    }
}
