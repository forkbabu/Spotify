package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.o;
import com.spotify.playlist.endpoints.i;
import io.reactivex.y;

public final class p implements fjf<o> {
    private final wlf<y> a;
    private final wlf<i> b;
    private final wlf<wb6> c;
    private final wlf<me6> d;
    private final wlf<o> e;
    private final wlf<String> f;
    private final wlf<HomeMixFormatListAttributesHelper> g;
    private final wlf<l> h;

    public p(wlf<y> wlf, wlf<i> wlf2, wlf<wb6> wlf3, wlf<me6> wlf4, wlf<o> wlf5, wlf<String> wlf6, wlf<HomeMixFormatListAttributesHelper> wlf7, wlf<l> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
