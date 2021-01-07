package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class z0 implements l {
    public static final /* synthetic */ z0 a = new z0();

    private /* synthetic */ z0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = e4.D;
        if (th instanceof TimeoutException) {
            return IapException.b("Failed to play.");
        }
        return s.P(th);
    }
}
