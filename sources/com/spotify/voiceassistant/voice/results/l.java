package com.spotify.voiceassistant.voice.results;

import com.spotify.voice.results.model.e;

public final class l implements fjf<k> {
    private final wlf<nmf<h, io.reactivex.l<e.a>>> a;

    public l(wlf<nmf<h, io.reactivex.l<e.a>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get());
    }
}
