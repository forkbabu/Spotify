package com.spotify.music.features.partneraccountlinking;

public final class s implements fjf<PartnerAccountLinkingSessionHelper> {
    private final wlf<yn1> a;

    public s(wlf<yn1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PartnerAccountLinkingSessionHelper(this.a.get());
    }
}
