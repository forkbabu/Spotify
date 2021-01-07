package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

public class PartnerAccountLinkingSessionHelper {
    private final yn1 a;

    public enum State {
        LOGGED_IN,
        NOT_LOGGED_IN,
        ERROR
    }

    PartnerAccountLinkingSessionHelper(yn1 yn1) {
        this.a = yn1;
    }

    /* access modifiers changed from: package-private */
    public s<State> a() {
        g<SessionState> a2 = this.a.a();
        a2.getClass();
        return new v(a2).Q(h.a).W(g.a, false, Integer.MAX_VALUE).E();
    }
}
