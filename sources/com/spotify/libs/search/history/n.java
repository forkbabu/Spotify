package com.spotify.libs.search.history;

import android.app.Application;
import com.spotify.music.json.g;

public final class n implements fjf<m> {
    private final wlf<Application> a;
    private final wlf<g> b;

    public n(wlf<Application> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get());
    }
}
