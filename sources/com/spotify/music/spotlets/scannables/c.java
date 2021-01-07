package com.spotify.music.spotlets.scannables;

import android.content.Context;
import com.google.common.base.Charsets;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public class c {
    static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("scannables_onboarding_completed");
    private final i a;

    public c(i iVar) {
        this.a = iVar;
    }

    public static String b(String str) {
        return je.x0("https://scannables.scdn.co/uri/800/", gf0.d(str, Charsets.UTF_8));
    }

    public String a(String str, String str2, boolean z) {
        return z ? b(str2) : str;
    }

    public boolean c(Context context, String str) {
        return this.a.b(context, str).d(b, false);
    }

    public void d(Context context, String str, boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b(context, str).b();
        b2.a(b, z);
        b2.i();
    }
}
