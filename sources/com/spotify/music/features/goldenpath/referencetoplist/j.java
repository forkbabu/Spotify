package com.spotify.music.features.goldenpath.referencetoplist;

import com.spotify.http.u;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class j implements fjf<e> {
    private final wlf<u> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public j(wlf<u> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.b.get();
        int i = h.a;
        e eVar = (e) this.a.get().b(e.class);
        yif.g(eVar, "Cannot return null from a non-@Nullable @Provides method");
        return eVar;
    }
}
