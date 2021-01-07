package com.spotify.music.builtinauth.cache;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.u7;

public class p0 implements d {
    private final r0 a;
    private final t0 b;
    private final u7 c;

    public p0(r0 r0Var, t0 t0Var, u7 u7Var) {
        this.a = r0Var;
        this.b = t0Var;
        this.c = u7Var;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.c.a()) {
            this.b.b();
            this.a.f();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.c.a()) {
            this.a.g();
            this.b.c();
            return;
        }
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "inter-app-auth-cache-updater";
    }
}
