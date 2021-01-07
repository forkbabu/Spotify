package com.spotify.music.features.premiumdestination;

import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;

public final class e0 implements fjf<String> {
    private final wlf<PremiumPageLocale> a;
    private final wlf<String> b;

    public e0(wlf<PremiumPageLocale> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        PremiumPageLocale premiumPageLocale = this.a.get();
        String str = this.b.get();
        if (!premiumPageLocale.g().isEmpty()) {
            str = premiumPageLocale.g();
        }
        yif.g(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }
}
