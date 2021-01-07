package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.music.libs.viewuri.c;

public final class b implements fjf<a> {
    private final wlf<c> a;
    private final wlf<etc> b;
    private final wlf<f> c;
    private final wlf<Boolean> d;
    private final wlf<Boolean> e;

    public b(wlf<c> wlf, wlf<etc> wlf2, wlf<f> wlf3, wlf<Boolean> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static b a(wlf<c> wlf, wlf<etc> wlf2, wlf<f> wlf3, wlf<Boolean> wlf4, wlf<Boolean> wlf5) {
        return new b(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get(), this.c.get(), this.d.get().booleanValue(), this.e.get().booleanValue());
    }
}
