package com.spotify.mobile.android.spotlets.bixbyhomecards;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class e implements d {
    private final c a;

    public e(c cVar) {
        this.a = cVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "BixbyHomeCardService";
    }
}
