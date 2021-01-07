package com.spotify.music.features.listeninghistory.datasource;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class f implements fjf<e> {
    private final wlf<SpSharedPreferences<Object>> a;

    public f(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get());
    }
}
