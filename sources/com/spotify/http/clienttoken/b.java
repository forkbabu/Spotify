package com.spotify.http.clienttoken;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class b implements c {
    public static final SpSharedPreferences.b<Object, String> b;
    private final SpSharedPreferences<Object> a;

    static {
        SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("CLIENT_TOKEN");
        h.d(c, "SpSharedPreferences.Pref…y.makeKey(\"CLIENT_TOKEN\")");
        b = c;
    }

    public b(SpSharedPreferences spSharedPreferences, f fVar) {
        this.a = spSharedPreferences;
    }

    @Override // com.spotify.http.clienttoken.c
    public void a(String str) {
        h.e(str, "encryptedClientToken");
        try {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.f(b, str);
            b2.i();
        } catch (IllegalStateException e) {
            Logger.b("Failed to store the token: " + e, new Object[0]);
        }
    }

    @Override // com.spotify.http.clienttoken.c
    public String b() {
        return this.a.m(b, null);
    }

    @Override // com.spotify.http.clienttoken.c
    public void c() {
        try {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.h(b);
            b2.i();
        } catch (NullPointerException e) {
            Logger.b("Failed to clear the token: " + e, new Object[0]);
        }
    }
}
