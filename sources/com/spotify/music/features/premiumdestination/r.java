package com.spotify.music.features.premiumdestination;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

public final class r implements fjf<String> {
    private final wlf<PremiumPageLocale> a;

    public r(wlf<PremiumPageLocale> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PremiumPageLocale premiumPageLocale = this.a.get();
        if (premiumPageLocale.d().isEmpty()) {
            return null;
        }
        return premiumPageLocale.d();
    }
}
