package com.spotify.image.provider;

import android.content.Context;

public final class d implements fjf<MediaUriUtil> {
    private final wlf<String> a;
    private final wlf<Context> b;

    public d(wlf<String> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MediaUriUtil(this.a.get(), this.b.get());
    }
}
