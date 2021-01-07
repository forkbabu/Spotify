package com.spotify.mobile.android.util.prefs;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.c;

public final /* synthetic */ class a implements c {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(((SpSharedPreferences) obj).c((SpSharedPreferences.b) obj2));
    }
}
