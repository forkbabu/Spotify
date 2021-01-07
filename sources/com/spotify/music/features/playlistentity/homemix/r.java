package com.spotify.music.features.playlistentity.homemix;

import com.spotify.music.connection.l;
import com.spotify.playlist.endpoints.i;

public final class r implements fjf<q> {
    private final wlf<af6> a;
    private final wlf<String> b;
    private final wlf<i> c;
    private final wlf<l> d;
    private final wlf<vb6> e;

    public r(wlf<af6> wlf, wlf<String> wlf2, wlf<i> wlf3, wlf<l> wlf4, wlf<vb6> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
