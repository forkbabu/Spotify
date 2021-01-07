package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = t.c;
        return ((SpSharedPreferences.Update) obj).a;
    }
}
