package com.spotify.music.libs.podcast.presentationcommons.description.step.html;

import defpackage.soa;

public final class b implements fjf<a> {
    private final wlf<d> a;
    private final wlf<soa.a> b;

    public b(wlf<d> wlf, wlf<soa.a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.b.get());
    }
}
