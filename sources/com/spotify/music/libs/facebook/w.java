package com.spotify.music.libs.facebook;

import com.spotify.mobile.android.service.plugininterfaces.d;

public class w implements d {
    private final wlf<u> a;
    private u b;

    public w(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        u uVar = this.a.get();
        this.b = uVar;
        uVar.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        u uVar = this.b;
        if (uVar != null) {
            uVar.c();
            this.b = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SocialErrorNotifier";
    }
}
