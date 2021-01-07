package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class n0 {
    private final y a;
    private final g<SessionState> b;

    public n0(y yVar, g<SessionState> gVar) {
        this.a = yVar;
        this.b = gVar;
    }

    public static boolean b(SessionState sessionState) {
        if (!(!sessionState.loggedIn() && !sessionState.loggingIn())) {
            if (!(!sessionState.canConnect() && !sessionState.connected()) && !d(sessionState)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean d(SessionState sessionState) {
        return sessionState.loggedIn() && sessionState.connected();
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.b.C(x.a).k0(60, TimeUnit.SECONDS, this.a).i0(w.a).H(b0.a).D(a0.a);
    }

    public s<Boolean> f() {
        g<SessionState> gVar = this.b;
        w wVar = w.a;
        return new v(gVar.C(wVar).i0(wVar).O(y.a).k0(10, TimeUnit.SECONDS, this.a)).q0(z.a);
    }
}
