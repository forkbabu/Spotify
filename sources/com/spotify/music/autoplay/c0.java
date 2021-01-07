package com.spotify.music.autoplay;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class c0 implements fjf<Boolean> {
    private final wlf<SpSharedPreferences<Object>> a;

    public c0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d(a0.a, true));
    }
}
