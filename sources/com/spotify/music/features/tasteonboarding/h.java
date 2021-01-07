package com.spotify.music.features.tasteonboarding;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class h implements fjf<f> {
    private final wlf<l0e> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public h(wlf<l0e> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
