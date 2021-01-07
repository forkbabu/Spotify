package com.spotify.music.libs.accountlinkingnudges;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final class h {
    private static final SpSharedPreferences.b<Object, Long> a;
    private static final SpSharedPreferences.b<Object, Long> b;
    private static final SpSharedPreferences.b<Object, Long> c;

    static {
        SpSharedPreferences.b<Object, Long> e = SpSharedPreferences.b.e("first_time_shown");
        kotlin.jvm.internal.h.d(e, "makeUserKey(\"first_time_shown\")");
        a = e;
        SpSharedPreferences.b<Object, Long> e2 = SpSharedPreferences.b.e("second_time_shown");
        kotlin.jvm.internal.h.d(e2, "makeUserKey(\"second_time_shown\")");
        b = e2;
        SpSharedPreferences.b<Object, Long> e3 = SpSharedPreferences.b.e("third_time_shown");
        kotlin.jvm.internal.h.d(e3, "makeUserKey(\"third_time_shown\")");
        c = e3;
    }

    public static final SpSharedPreferences.b<Object, Long> a() {
        return a;
    }

    public static final SpSharedPreferences.b<Object, Long> b() {
        return b;
    }

    public static final SpSharedPreferences.b<Object, Long> c() {
        return c;
    }
}
