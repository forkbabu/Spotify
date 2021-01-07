package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = t.c;
        SpSharedPreferences.a b = ((SpSharedPreferences) obj).b();
        b.a(t.c, false);
        b.i();
    }
}
