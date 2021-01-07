package com.spotify.music.playlist.synchronizer;

import com.spotify.playlist.endpoints.i;
import io.reactivex.y;

public final class c implements fjf<b> {
    private final wlf<i> a;
    private final wlf<y> b;

    public c(wlf<i> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a, this.b);
    }
}
