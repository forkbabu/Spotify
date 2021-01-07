package com.spotify.music.builtinauth.authenticator;

import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import io.reactivex.a;
import io.reactivex.functions.l;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class a0 implements l {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof TimeoutException)) {
            return a.t(th);
        }
        int i = BuiltInAuthException.a;
        return a.t(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_AUTHORIZATION_TIMEOUT, String.format(Locale.ENGLISH, "Could not authenticate within %d s. It is possible that there's an issue with Spotify auth services or the connection is unstable", 60)));
    }
}
