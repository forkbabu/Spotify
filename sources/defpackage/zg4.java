package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: zg4  reason: default package */
public final class zg4 {
    private static final SpSharedPreferences.b<Object, String> a = SpSharedPreferences.b.e("care_package_playlist_id");
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("care_package_debug_use_backend");

    public static final SpSharedPreferences.b<Object, Boolean> a() {
        return b;
    }

    public static final SpSharedPreferences.b<Object, String> b() {
        return a;
    }
}
