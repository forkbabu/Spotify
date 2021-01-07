package com.spotify.music.features.premiumdestination;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.premiumdestination.debug.PremiumPageEnvironment;
import java.util.NoSuchElementException;

public final class v implements fjf<String> {
    private final wlf<SpSharedPreferences<Object>> a;

    public v(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> spSharedPreferences = this.a.get();
        PremiumPageEnvironment premiumPageEnvironment = PremiumPageEnvironment.PROD;
        try {
            String l = spSharedPreferences.l(mi7.i);
            if (MoreObjects.isNullOrEmpty(l)) {
                return premiumPageEnvironment.d();
            }
            return PremiumPageEnvironment.valueOf(l).d();
        } catch (IllegalArgumentException | NoSuchElementException unused) {
            return premiumPageEnvironment.d();
        }
    }
}
