package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import android.content.Context;

public final class k implements fjf<j> {
    private final wlf<Context> a;

    public k(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
