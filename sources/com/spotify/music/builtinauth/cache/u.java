package com.spotify.music.builtinauth.cache;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class u implements n {
    public static final /* synthetic */ u a = new u();

    private /* synthetic */ u() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return sessionState.loggingOut() || !sessionState.loggedIn();
    }
}
