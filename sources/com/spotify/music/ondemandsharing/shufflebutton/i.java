package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.libs.glue.custom.playbutton.c;

public final class i implements fjf<h> {
    private final wlf<r> a;
    private final wlf<c.a> b;

    public i(wlf<r> wlf, wlf<c.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get(), this.b.get());
    }
}
