package com.spotify.music.features.premiumdestination;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.premiumdestination.debug.PremiumPageEligibility;
import java.util.NoSuchElementException;

public final class u implements fjf<String> {
    private final wlf<SpSharedPreferences<Object>> a;

    public u(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> spSharedPreferences = this.a.get();
        PremiumPageEligibility premiumPageEligibility = PremiumPageEligibility.DEFAULT_ELIGIBILITY;
        try {
            String l = spSharedPreferences.l(mi7.g);
            if (MoreObjects.isNullOrEmpty(l)) {
                return premiumPageEligibility.d();
            }
            return PremiumPageEligibility.valueOf(l).d();
        } catch (IllegalArgumentException | NoSuchElementException unused) {
            return premiumPageEligibility.d();
        }
    }
}
