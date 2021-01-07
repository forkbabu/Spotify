package com.spotify.music.libs.podcast.loader;

import io.reactivex.y;

public final class x implements fjf<w> {
    private final wlf<qna> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public x(wlf<qna> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a, this.b, this.c);
    }
}
