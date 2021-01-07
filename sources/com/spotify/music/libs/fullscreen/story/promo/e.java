package com.spotify.music.libs.fullscreen.story.promo;

import com.spotify.rxjava2.q;
import io.reactivex.z;

public final class e implements fjf<d> {
    private final wlf<vfa> a;
    private final wlf<z<p62>> b;
    private final wlf<q> c;

    public e(wlf<vfa> wlf, wlf<z<p62>> wlf2, wlf<q> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
