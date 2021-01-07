package com.spotify.mobile.android.util.prefs;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class i {
    private final String a = "spotify_preferences";
    private final Map<String, SpSharedPreferences<?>> b = new HashMap(4);

    private synchronized SpSharedPreferences<?> c(Context context, String str) {
        SpSharedPreferences<?> spSharedPreferences;
        spSharedPreferences = this.b.get(str);
        if (spSharedPreferences == null) {
            spSharedPreferences = new SpSharedPreferences<>(new e(context, str));
            this.b.put(str, spSharedPreferences);
        }
        return spSharedPreferences;
    }

    public synchronized SpSharedPreferences<Object> a(Context context) {
        return c(context, this.a);
    }

    public synchronized SpSharedPreferences<Object> b(Context context, String str) {
        SpSharedPreferences<?> spSharedPreferences;
        if (!str.isEmpty()) {
            synchronized (this) {
                spSharedPreferences = this.b.get(str);
                if (spSharedPreferences == null) {
                    spSharedPreferences = new l(new f(context, str), a(context));
                    this.b.put(str, spSharedPreferences);
                }
            }
            return spSharedPreferences;
        }
        throw new IllegalArgumentException();
        return spSharedPreferences;
    }

    @Deprecated
    public synchronized SpSharedPreferences<Object> d(Context context) {
        return c(context, this.a);
    }
}
