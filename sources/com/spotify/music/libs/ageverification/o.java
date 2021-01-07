package com.spotify.music.libs.ageverification;

import com.spotify.music.libs.mediabrowserservice.d2;
import com.spotify.playlist.endpoints.d;

public final class o implements fjf<n> {
    private final wlf<l31> a;
    private final wlf<d2> b;
    private final wlf<d> c;

    public o(wlf<l31> wlf, wlf<d2> wlf2, wlf<d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get());
    }
}
