package com.spotify.music.libs.carmodeengine.settings;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = q.d;
        return ((SpSharedPreferences.Update) obj).a;
    }
}
