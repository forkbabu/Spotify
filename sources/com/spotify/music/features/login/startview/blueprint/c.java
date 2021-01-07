package com.spotify.music.features.login.startview.blueprint;

import com.spotify.libs.pse.model.e;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.features.login.startview.cta.a;

public final class c implements fjf<BlueprintActionsButtonProviderImpl> {
    private final wlf<a> a;
    private final wlf<d> b;
    private final wlf<e> c;
    private final wlf<ae0> d;
    private final wlf<je0> e;

    public c(wlf<a> wlf, wlf<d> wlf2, wlf<e> wlf3, wlf<ae0> wlf4, wlf<je0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new BlueprintActionsButtonProviderImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
