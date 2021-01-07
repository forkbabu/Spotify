package com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders;

import com.spotify.music.libs.freetiertrackpreview.listeners.a;

public final class d implements fjf<b> {
    private final wlf<a> a;
    private final wlf<e> b;

    public d(wlf<a> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
