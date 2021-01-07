package com.spotify.cosmos.android;

import android.os.IBinder;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (RemoteNativeRouter) ((IBinder) obj);
    }
}
