package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class q2 implements l {
    public static final /* synthetic */ q2 a = new q2();

    private /* synthetic */ q2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = e4.D;
        if (th instanceof TimeoutException) {
            return IapException.b("Failed to switch to local device.");
        }
        return s.P(th);
    }
}
