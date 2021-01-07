package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public class n {
    private static final SpSharedPreferences.b<Object, Integer> b = SpSharedPreferences.b.e("playback_error_code");
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.e("playback_error_uri");
    private final SpSharedPreferences<Object> a;

    public n(Context context, i iVar) {
        this.a = iVar.d(context);
    }

    public void a(int i, String str) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.b(b, i);
        b2.f(c, str);
        b2.i();
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.h(b);
        b2.h(c);
        b2.i();
    }

    public int c() {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, Integer> bVar = b;
        MoreObjects.checkArgument(spSharedPreferences.a(bVar));
        return this.a.e(bVar);
    }

    public String d() {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, String> bVar = c;
        MoreObjects.checkArgument(spSharedPreferences.a(bVar));
        return this.a.l(bVar);
    }

    public boolean e() {
        return this.a.a(b);
    }
}
