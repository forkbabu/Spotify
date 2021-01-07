package com.spotify.music.builtinauth.authenticator;

import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class z implements l {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof TimeoutException) {
            return s.i0(Boolean.FALSE);
        }
        return s.P(th);
    }
}
