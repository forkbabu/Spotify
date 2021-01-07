package com.spotify.music.libs.carmodeengine.settings;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public class r {
    static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("key_driving_mode");
    static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("key_driving_mode_always_on");
    private final SpSharedPreferences<Object> a;
    private final c6a b;

    r(SpSharedPreferences<Object> spSharedPreferences, c6a c6a) {
        this.a = spSharedPreferences;
        this.b = c6a;
    }

    public void a() {
        y6a y6a;
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, Boolean> bVar = c;
        if (spSharedPreferences.a(bVar)) {
            SpSharedPreferences<Object> spSharedPreferences2 = this.a;
            SpSharedPreferences.b<Object, Boolean> bVar2 = d;
            if (spSharedPreferences2.a(bVar2)) {
                boolean c2 = this.a.c(bVar);
                if (this.a.c(bVar2)) {
                    y6a = y6a.a();
                } else if (c2) {
                    y6a = y6a.b();
                } else {
                    y6a = y6a.d();
                }
                this.b.d(y6a);
                SpSharedPreferences.a<Object> b2 = this.a.b();
                b2.h(bVar2);
                b2.h(bVar);
                b2.i();
            }
        }
    }
}
