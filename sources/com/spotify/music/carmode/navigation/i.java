package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = t.c;
        SpSharedPreferences.a b = ((SpSharedPreferences) obj).b();
        b.a(t.d, false);
        b.i();
    }
}
