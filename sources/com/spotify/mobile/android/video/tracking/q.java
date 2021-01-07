package com.spotify.mobile.android.video.tracking;

import com.spotify.messages.BetamaxPlaybackErrorDevice;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.exception.BetamaxException;

public final class q {
    private static BetamaxPlaybackErrorDevice a(d0 d0Var, String str, int i, Throwable th) {
        String str2;
        BetamaxPlaybackErrorDevice.b r = BetamaxPlaybackErrorDevice.r();
        r.m(i);
        if (th == null || (str2 = th.getMessage()) == null) {
            str2 = "";
        }
        r.n(str2);
        r.o(z42.p(th));
        r.p(z42.o(th));
        r.q(z42.n(th));
        r.t(d0Var.d());
        r.r(str);
        r.s(d0Var.b());
        return (BetamaxPlaybackErrorDevice) r.build();
    }

    public static BetamaxPlaybackErrorDevice b(d0 d0Var, String str, BetamaxException betamaxException) {
        return a(d0Var, str, betamaxException.a().d(), betamaxException);
    }

    public static BetamaxPlaybackErrorDevice c(d0 d0Var, String str, Throwable th) {
        return a(d0Var, str, th != null ? th.hashCode() : -1, th);
    }
}
