package com.spotify.connect.snacks;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;
import org.json.JSONObject;

public final class k {
    private static final SpSharedPreferences.b<Object, JSONObject> a;

    static {
        SpSharedPreferences.b<Object, JSONObject> e = SpSharedPreferences.b.e("connect_snacks_available_devices");
        h.d(e, "PrefsKey.makeUserKey<JSO…nacks_available_devices\")");
        a = e;
    }

    public static final SpSharedPreferences.b<Object, JSONObject> a() {
        return a;
    }
}
