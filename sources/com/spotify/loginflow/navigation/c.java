package com.spotify.loginflow.navigation;

import java.util.Map;

public final class c implements fjf<d> {
    private final wlf<androidx.fragment.app.c> a;
    private final wlf<Map<Class<? extends Destination>, y01<? extends Destination>>> b;

    public c(wlf<androidx.fragment.app.c> wlf, wlf<Map<Class<? extends Destination>, y01<? extends Destination>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u01(this.b.get(), this.a.get());
    }
}
