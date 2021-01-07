package com.spotify.music.playlist.extender;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class l0 implements fjf<Boolean> {
    private final wlf<SpSharedPreferences<Object>> a;

    public l0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d(g0.L, false));
    }
}
