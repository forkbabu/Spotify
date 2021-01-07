package com.spotify.music.features.playlistentity.homemix;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class p implements fjf<o> {
    private final wlf<SpSharedPreferences<Object>> a;

    public p(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o(this.a.get());
    }
}
