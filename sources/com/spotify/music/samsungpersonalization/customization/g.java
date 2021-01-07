package com.spotify.music.samsungpersonalization.customization;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

public final class g {
    private static final SpSharedPreferences.b<Object, Boolean> a;

    static {
        SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("key_samsung_personalization");
        h.d(e, "PrefsKey.makeUserKey(\"ke…samsung_personalization\")");
        a = e;
    }

    public static final SpSharedPreferences.b<Object, Boolean> a() {
        return a;
    }
}
