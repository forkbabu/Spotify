package com.spotify.music.podcastinteractivity.qna.datasource;

import io.reactivex.y;

public final class k implements fjf<j> {
    private final wlf<y> a;

    public k(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
