package com.spotify.music.libs.bluetooth;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;
import java.util.Set;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, Set<String>> bVar = j.e;
        Logger.e((Throwable) obj, "Something went wrong while fetching category.", new Object[0]);
    }
}
