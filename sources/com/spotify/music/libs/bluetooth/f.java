package com.spotify.music.libs.bluetooth;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.n;
import java.io.IOException;
import java.util.Set;
import retrofit2.HttpException;

public final /* synthetic */ class f implements n {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        SpSharedPreferences.b<Object, Set<String>> bVar = j.e;
        return (th instanceof IOException) || (th instanceof HttpException);
    }
}
