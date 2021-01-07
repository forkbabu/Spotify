package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.util.connectivity.c0;

public final class p implements fjf<o> {
    private final wlf<rv5> a;
    private final wlf<c0> b;
    private final wlf<l> c;
    private final wlf<PartnerAccountLinkingSessionHelper> d;
    private final wlf<PartnerAccountLinkingLogger> e;

    public p(wlf<rv5> wlf, wlf<c0> wlf2, wlf<l> wlf3, wlf<PartnerAccountLinkingSessionHelper> wlf4, wlf<PartnerAccountLinkingLogger> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
