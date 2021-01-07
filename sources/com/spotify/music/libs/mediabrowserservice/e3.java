package com.spotify.music.libs.mediabrowserservice;

import com.spotify.image.provider.MediaUriUtil;

public final class e3 implements fjf<d3> {
    private final wlf<MediaUriUtil> a;
    private final wlf<d2> b;

    public e3(wlf<MediaUriUtil> wlf, wlf<d2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d3(this.a.get(), this.b.get());
    }
}
