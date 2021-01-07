package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.appprotocol.api.UserIsNotLoggedInException;
import com.spotify.music.appprotocol.api.b;
import io.reactivex.a;

public class z3 {
    private b a;
    private volatile SessionState b;

    public z3(b bVar) {
        this.a = bVar;
    }

    public void a(int i) {
        this.a = this.a.c(i);
    }

    public a b(int i, AppProtocol.ImageIdentifier imageIdentifier) {
        return a.k(c(i), a.u(new r0(imageIdentifier, "Identifier is null.")), a.u(new u0(imageIdentifier, "ImageUri is null or empty.")));
    }

    public a c(int i) {
        return a.k(a.u(new t0(this)), d(i));
    }

    public a d(int i) {
        return a.u(new s0(this, i));
    }

    public /* synthetic */ void e() {
        SessionState sessionState = this.b;
        if (sessionState == null || !sessionState.loggedIn()) {
            throw new UserIsNotLoggedInException();
        }
    }

    public /* synthetic */ void f(int i) {
        this.a.a(i);
    }

    public void g(SessionState sessionState) {
        this.b = sessionState;
    }
}
