package com.spotify.music.libs.carmodeengine.settings;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.n;

public final /* synthetic */ class e implements n {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = q.d;
        return ((SpSharedPreferences.Update) obj).b == SpSharedPreferences.Update.Type.CHANGED;
    }
}
