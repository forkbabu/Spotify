package com.spotify.music.appprotocol.superbird.earcon;

import com.spotify.superbird.earcon.a;

public final class b implements fjf<EarconEndpoints> {
    private final wlf<a> a;

    public b(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EarconEndpoints(this.a.get());
    }
}
