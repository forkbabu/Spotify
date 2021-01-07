package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SessionState sessionState = (SessionState) obj;
        if (!sessionState.loggedIn()) {
            return s.P(new IllegalStateException("User is logged out"));
        }
        return s.i0(sessionState);
    }
}
