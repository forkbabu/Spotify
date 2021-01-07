package com.spotify.music.features.premiumdestination;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.premiumdestination.debug.PremiumPageLocale;
import java.util.NoSuchElementException;

public final class f0 implements fjf<PremiumPageLocale> {
    private final wlf<SpSharedPreferences<Object>> a;

    public f0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PremiumPageLocale premiumPageLocale;
        try {
            premiumPageLocale = PremiumPageLocale.valueOf(this.a.get().l(mi7.f));
        } catch (IllegalArgumentException | NoSuchElementException unused) {
            premiumPageLocale = PremiumPageLocale.DEFAULT_LOCALE;
        }
        yif.g(premiumPageLocale, "Cannot return null from a non-@Nullable @Provides method");
        return premiumPageLocale;
    }
}
