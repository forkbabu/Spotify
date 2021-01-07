package com.spotify.music.builtinauth.authenticator;

import android.app.Application;

public final class m0 implements fjf<l0> {
    private final wlf<Application> a;
    private final wlf<hl2> b;

    public m0(wlf<Application> wlf, wlf<hl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static l0 a(Application application, hl2 hl2) {
        return new l0(application, hl2);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l0(this.a.get(), this.b.get());
    }
}
