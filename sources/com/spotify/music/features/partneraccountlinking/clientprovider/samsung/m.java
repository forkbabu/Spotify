package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.spotify.remoteconfig.xj;

public final class m implements fjf<l> {
    private final wlf<j> a;
    private final wlf<sv5> b;
    private final wlf<xj> c;

    public m(wlf<j> wlf, wlf<sv5> wlf2, wlf<xj> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static l a(j jVar, sv5 sv5, xj xjVar) {
        return new l(jVar, sv5, xjVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get());
    }
}
