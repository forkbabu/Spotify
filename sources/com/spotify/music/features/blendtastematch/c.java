package com.spotify.music.features.blendtastematch;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.blendtastematch.api.a;
import com.spotify.music.features.blendtastematch.view.g;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.a0;

public final class c implements fjf<BlendTasteMatchInjector> {
    private final wlf<a> a;
    private final wlf<g> b;
    private final wlf<t> c;
    private final wlf<ere> d;
    private final wlf<a0> e;
    private final wlf<SnackbarManager> f;

    public c(wlf<a> wlf, wlf<g> wlf2, wlf<t> wlf3, wlf<ere> wlf4, wlf<a0> wlf5, wlf<SnackbarManager> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new BlendTasteMatchInjector(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
