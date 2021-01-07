package com.spotify.mobile.android.spotlets.appprotocol;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class s2 implements l {
    public static final /* synthetic */ s2 a = new s2();

    private /* synthetic */ s2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = e4.D;
        if (th instanceof TimeoutException) {
            return IapException.b("Failed to set Podcast playback speed.");
        }
        return s.P(th);
    }
}
