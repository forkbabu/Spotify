package com.spotify.mobile.android.service;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public class u implements g<SessionState> {
    private final t a;
    private boolean b;

    public u(t tVar) {
        tVar.getClass();
        this.a = tVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(SessionState sessionState) {
        SessionState sessionState2 = sessionState;
        boolean z = this.b;
        boolean loggedIn = sessionState2.loggedIn();
        this.b = loggedIn;
        if (loggedIn && !z) {
            this.a.b(sessionState2);
        } else if (!loggedIn && z) {
            this.a.a();
        }
    }
}
