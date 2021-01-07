package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class b0 implements l {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SessionState sessionState = (SessionState) obj;
        if (!sessionState.loggedIn()) {
            return a.t(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_NOT_LOGGED_IN, "The user must go to the Spotify and log-in"));
        }
        if (!sessionState.canConnect()) {
            return a.t(new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_OFFLINE_MODE_ACTIVE, "Spotify must be online to verify this authorization request. Spotify can authorize requests offline only for a limited period of time"));
        }
        return b.a;
    }
}
