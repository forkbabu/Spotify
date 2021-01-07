package com.spotify.music.homecomponents.commands;

import androidx.lifecycle.n;
import com.spotify.music.libs.home.common.contentapi.b;

public final class a implements fjf<HomeHeartClickCommandHandler> {
    private final wlf<n> a;
    private final wlf<b> b;
    private final wlf<b> c;

    public a(wlf<n> wlf, wlf<b> wlf2, wlf<b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new HomeHeartClickCommandHandler(this.a.get(), this.b.get(), this.c.get());
    }
}
