package com.spotify.mobile.android.util.prefs;

import android.content.SharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Set;

/* access modifiers changed from: package-private */
public class l extends SpSharedPreferences<Object> {
    private final SpSharedPreferences<Object> b;

    private static class a extends SpSharedPreferences.a<Object> {
        a(SharedPreferences.Editor editor) {
            super(editor);
        }
    }

    l(wlf<SharedPreferences> wlf, SpSharedPreferences<Object> spSharedPreferences) {
        super(wlf);
        this.b = spSharedPreferences;
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public SpSharedPreferences.a<Object> b() {
        return new a(k().edit());
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public boolean c(SpSharedPreferences.b<Object, Boolean> bVar) {
        return d(bVar, false);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public boolean d(SpSharedPreferences.b<Object, Boolean> bVar, boolean z) {
        String a2 = bVar.a();
        SharedPreferences k = k();
        if (k.contains(a2)) {
            return k.getBoolean(a2, z);
        }
        if (k.contains("__cleared__")) {
            return z;
        }
        return this.b.k().getBoolean(a2, z);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public int e(SpSharedPreferences.b<Object, Integer> bVar) {
        return f(bVar, 0);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public int f(SpSharedPreferences.b<Object, Integer> bVar, int i) {
        String a2 = bVar.a();
        SharedPreferences k = k();
        if (k.contains(a2)) {
            return k.getInt(a2, i);
        }
        if (k.contains("__cleared__")) {
            return i;
        }
        return this.b.k().getInt(a2, i);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public long i(SpSharedPreferences.b<Object, Long> bVar) {
        return j(bVar, 0);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public long j(SpSharedPreferences.b<Object, Long> bVar, long j) {
        String a2 = bVar.a();
        SharedPreferences k = k();
        if (k.contains(a2)) {
            return k.getLong(a2, j);
        }
        if (k.contains("__cleared__")) {
            return j;
        }
        return this.b.k().getLong(a2, j);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public String l(SpSharedPreferences.b<Object, String> bVar) {
        return m(bVar, null);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public String m(SpSharedPreferences.b<Object, String> bVar, String str) {
        String a2 = bVar.a();
        SharedPreferences k = k();
        if (k.contains(a2)) {
            return k.getString(a2, str);
        }
        if (k.contains("__cleared__")) {
            return str;
        }
        return this.b.k().getString(a2, str);
    }

    @Override // com.spotify.mobile.android.util.prefs.SpSharedPreferences
    public Set<String> o(SpSharedPreferences.b<Object, Set<String>> bVar, Set<String> set) {
        String a2 = bVar.a();
        SharedPreferences k = k();
        if (k.contains(a2)) {
            return k.getStringSet(a2, set);
        }
        if (k.contains("__cleared__")) {
            return set;
        }
        return this.b.k().getStringSet(a2, set);
    }
}
