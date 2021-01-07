package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.voice.e;

/* renamed from: q8b  reason: default package */
public final class q8b {
    public static String a(SpSharedPreferences<Object> spSharedPreferences, String str) {
        String m = spSharedPreferences.m(e.i, null);
        return (m == null || kotlin.text.e.n(m)) ? str : m;
    }
}
