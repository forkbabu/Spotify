package com.spotify.music.features.playlistentity.homemix;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class o {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("home-mix-tuning-education-shown");
    private final SpSharedPreferences<Object> a;

    static {
        SpSharedPreferences.b.e("home-context-menu-education-shown");
    }

    public o(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public boolean a() {
        return this.a.d(b, false);
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, true);
        b2.i();
    }
}
