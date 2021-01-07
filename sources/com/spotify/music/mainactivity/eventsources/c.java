package com.spotify.music.mainactivity.eventsources;

import com.spotify.mobile.android.service.session.SessionState;
import defpackage.ufb;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<SessionState, ufb> {
    public static final c a = new c();

    c() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ufb apply(SessionState sessionState) {
        SessionState sessionState2 = sessionState;
        h.e(sessionState2, "sessionState");
        return new ufb.c(sessionState2);
    }
}
