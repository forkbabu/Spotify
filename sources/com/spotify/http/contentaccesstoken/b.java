package com.spotify.http.contentaccesstoken;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class b implements c {
    public static final SpSharedPreferences.b<Object, String> c;
    private final Set<a> a = new CopyOnWriteArraySet();
    private final SpSharedPreferences<Object> b;

    static {
        SpSharedPreferences.b<Object, String> c2 = SpSharedPreferences.b.c("CONTENT_ACCESS_REFRESH_TOKEN");
        h.d(c2, "SpSharedPreferences.Pref…NT_ACCESS_REFRESH_TOKEN\")");
        c = c2;
    }

    public b(SpSharedPreferences spSharedPreferences, f fVar) {
        this.b = spSharedPreferences;
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public void a() {
        try {
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.h(c);
            b2.i();
            for (a aVar : this.a) {
                aVar.f();
            }
        } catch (NullPointerException e) {
            Logger.b("Failed to clear the token: " + e, new Object[0]);
        }
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public void b(String str) {
        h.e(str, "contentAccessRefreshToken");
        try {
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.f(c, str);
            b2.i();
            for (a aVar : this.a) {
                aVar.d();
            }
        } catch (IllegalStateException e) {
            Logger.b("Failed to store the token: " + e, new Object[0]);
        }
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public void c(a aVar) {
        h.e(aVar, "contentAccessRefreshTokenChangeListener");
        this.a.add(aVar);
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public void d(a aVar) {
        h.e(aVar, "contentAccessRefreshTokenChangeListener");
        this.a.remove(aVar);
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public String e() {
        return this.b.m(c, null);
    }

    @Override // com.spotify.http.contentaccesstoken.c
    public boolean f() {
        return e() != null;
    }
}
