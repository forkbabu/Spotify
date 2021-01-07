package com.spotify.music.features.payfail;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class e implements n {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return sessionState.loggedIn() && !sessionState.loggingOut();
    }
}
