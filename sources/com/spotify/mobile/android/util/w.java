package com.spotify.mobile.android.util;

import android.content.ContentResolver;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class w implements fjf<v> {
    private final wlf<ContentResolver> a;
    private final wlf<SpSharedPreferences<Object>> b;

    public w(wlf<ContentResolver> wlf, wlf<SpSharedPreferences<Object>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get(), this.b.get());
    }
}
