package com.spotify.music.features.churnlockedstate;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.churnlockedstate.a;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Long> bVar = u.e;
        a.C0216a aVar = new a.C0216a();
        aVar.b(false);
        aVar.b(((Boolean) obj).booleanValue());
        return aVar.a();
    }
}
