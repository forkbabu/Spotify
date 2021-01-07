package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class v1 implements l {
    public static final /* synthetic */ v1 a = new v1();

    private /* synthetic */ v1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = e4.D;
        if (th instanceof TimeoutException) {
            return IapException.b("Failed to pause.");
        }
        return s.P(th);
    }
}
