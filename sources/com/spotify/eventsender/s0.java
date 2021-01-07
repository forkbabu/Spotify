package com.spotify.eventsender;

import android.content.Context;
import android.content.SharedPreferences;

public final class s0 implements n0 {
    private final a a;

    /* access modifiers changed from: package-private */
    public static class a {
        private SharedPreferences a;
        private final Context b;

        a(Context context) {
            this.b = context;
        }

        /* access modifiers changed from: package-private */
        public SharedPreferences a() {
            if (this.a == null) {
                this.a = this.b.getSharedPreferences("com.spotify.eventsender.shared.prefs", 0);
            }
            return this.a;
        }
    }

    s0(a aVar) {
        this.a = aVar;
    }

    public int a(String str, int i) {
        return this.a.a().getInt(str, i);
    }

    public String b(String str, String str2) {
        return this.a.a().getString(str, null);
    }

    public void c(String str, int i) {
        this.a.a().edit().putInt(str, i).apply();
    }

    public void d(String str, String str2) {
        this.a.a().edit().putString(str, str2).apply();
    }
}
