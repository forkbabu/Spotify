package com.spotify.music.features.premiumdestination;

public final class d0 implements fjf<String> {
    private final wlf<PremiumPageFragment> a;

    public d0(wlf<PremiumPageFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().k4().getString("page_id");
    }
}
