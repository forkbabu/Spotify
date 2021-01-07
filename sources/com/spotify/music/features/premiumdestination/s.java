package com.spotify.music.features.premiumdestination;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class s implements fjf<String> {
    private final wlf<SpSharedPreferences<Object>> a;

    public s(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String m = this.a.get().m(mi7.e, null);
        if (MoreObjects.isNullOrEmpty(m)) {
            return null;
        }
        return je.x0(m, "T00:00:00");
    }
}
