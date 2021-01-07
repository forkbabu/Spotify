package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = t.c;
        return ((SpSharedPreferences.Update) obj).a;
    }
}
