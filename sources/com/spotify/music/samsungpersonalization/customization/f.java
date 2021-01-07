package com.spotify.music.samsungpersonalization.customization;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class f implements fjf<e> {
    private final wlf<c> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<pyc> c;

    public f(wlf<c> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<pyc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
