package com.spotify.music.features.connect.cast.discovery;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;

public final class l implements fjf<k> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<g> b;

    public l(wlf<SpSharedPreferences<Object>> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k(this.a.get(), this.b.get());
    }
}
