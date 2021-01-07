package com.spotify.magiclink;

import android.text.TextUtils;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public class s {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.c("prompt_set_password");
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("one_time_reset_password_token");
    private final SpSharedPreferences<Object> a;

    public s(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public String a() {
        return this.a.m(c, null);
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.h(b);
        b2.h(c);
        b2.j();
    }

    public void c(String str) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, true);
        if (TextUtils.isEmpty(str)) {
            b2.h(c);
        } else {
            b2.f(c, str);
        }
        b2.j();
    }

    public boolean d() {
        return this.a.d(b, false);
    }
}
