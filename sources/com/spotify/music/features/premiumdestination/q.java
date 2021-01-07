package com.spotify.music.features.premiumdestination;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class q implements fjf<String> {
    private final wlf<SpSharedPreferences<Object>> a;

    public q(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().m(mi7.h, null);
    }
}
