package com.spotify.music.premiummini;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

public final class j {
    private static final SpSharedPreferences.b<Object, Boolean> a;

    static {
        SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("premium_mini_last_startup_state");
        h.d(e, "SpSharedPreferences.Pref…mini_last_startup_state\")");
        a = e;
    }

    public static final SpSharedPreferences.b<Object, Boolean> a() {
        return a;
    }
}
