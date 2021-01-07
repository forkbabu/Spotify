package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences spSharedPreferences = (SpSharedPreferences) obj;
        SpSharedPreferences.b<Object, Boolean> bVar = t.c;
        return spSharedPreferences.p(bVar).j0(l.a).G0((R) Boolean.valueOf(spSharedPreferences.d(bVar, true))).E();
    }
}
