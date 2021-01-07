package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences spSharedPreferences = (SpSharedPreferences) obj;
        SpSharedPreferences.b<Object, Boolean> bVar = t.d;
        return spSharedPreferences.p(bVar).j0(f.a).G0((R) Boolean.valueOf(spSharedPreferences.d(bVar, true))).E();
    }
}
