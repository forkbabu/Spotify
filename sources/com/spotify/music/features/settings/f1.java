package com.spotify.music.features.settings;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public final class f1 implements fjf<SpSharedPreferences<Object>> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<String> c;

    public f1(wlf<Context> wlf, wlf<i> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> d;
        Context context = this.a.get();
        i iVar = this.b.get();
        this.c.get();
        synchronized (iVar) {
            d = iVar.d(context);
        }
        return d;
    }
}
