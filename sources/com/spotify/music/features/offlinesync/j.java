package com.spotify.music.features.offlinesync;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class j implements d {
    private final e a;
    private final h b;

    public j(e eVar, h hVar) {
        this.a = eVar;
        this.b = hVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a(this.b);
        this.a.g();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.h();
        this.a.f(this.b);
        this.b.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "OfflineSync";
    }
}
