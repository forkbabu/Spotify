package com.spotify.music.libs.branchintegration.network;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class e implements fjf<d> {
    private final wlf<c> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<aqe> c;

    public e(wlf<c> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<aqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
