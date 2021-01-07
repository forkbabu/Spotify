package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class f2 implements l {
    public static final /* synthetic */ f2 a = new f2();

    private /* synthetic */ f2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = e4.D;
        if (th instanceof TimeoutException) {
            return IapException.b("Unable to start radio");
        }
        return s.P(th);
    }
}
