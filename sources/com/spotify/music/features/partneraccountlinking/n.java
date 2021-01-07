package com.spotify.music.features.partneraccountlinking;

import com.google.protobuf.u;
import com.spotify.ubi.specification.factories.i2;

public final class n implements fjf<PartnerAccountLinkingLogger> {
    private final wlf<rv5> a;
    private final wlf<ere> b;
    private final wlf<i2> c;
    private final wlf<gl0<u>> d;
    private final wlf<yyd> e;

    public n(wlf<rv5> wlf, wlf<ere> wlf2, wlf<i2> wlf3, wlf<gl0<u>> wlf4, wlf<yyd> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PartnerAccountLinkingLogger(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
