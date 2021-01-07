package com.spotify.connect.snacks;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

public final class i {
    private static final SpSharedPreferences.b<Object, Boolean> a;

    static {
        SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("connect_snacks_enabled");
        h.d(e, "SpSharedPreferences.Pref…\"connect_snacks_enabled\")");
        a = e;
    }

    public static final SpSharedPreferences.b<Object, Boolean> a() {
        return a;
    }
}
