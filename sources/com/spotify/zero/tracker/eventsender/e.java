package com.spotify.zero.tracker.eventsender;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class e implements fjf<d> {
    private final wlf<SpSharedPreferences<Object>> a;

    public e(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
