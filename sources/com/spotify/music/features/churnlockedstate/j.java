package com.spotify.music.features.churnlockedstate;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public final /* synthetic */ class j implements Function {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = u.e;
        return Boolean.valueOf(((String) obj).equals("1"));
    }
}
