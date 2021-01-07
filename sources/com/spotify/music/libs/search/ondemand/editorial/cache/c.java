package com.spotify.music.libs.search.ondemand.editorial.cache;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.e;

public final class c implements fjf<b> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<e> b;

    public c(wlf<SpSharedPreferences<Object>> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
