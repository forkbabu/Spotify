package com.spotify.music.spotlets.offline.util;

import com.spotify.music.connection.k;
import io.reactivex.y;

public final class d implements fjf<c> {
    private final wlf<k> a;
    private final wlf<y> b;

    public d(wlf<k> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c(this.a.get(), this.b.get());
    }
}
