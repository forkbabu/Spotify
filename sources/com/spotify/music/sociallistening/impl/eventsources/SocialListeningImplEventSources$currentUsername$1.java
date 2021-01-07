package com.spotify.music.sociallistening.impl.eventsources;

import com.spotify.mobile.android.service.session.SessionState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SocialListeningImplEventSources$currentUsername$1 extends FunctionReferenceImpl implements nmf<SessionState, String> {
    public static final SocialListeningImplEventSources$currentUsername$1 a = new SocialListeningImplEventSources$currentUsername$1();

    SocialListeningImplEventSources$currentUsername$1() {
        super(1, SessionState.class, "currentUser", "currentUser()Ljava/lang/String;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public String invoke(SessionState sessionState) {
        SessionState sessionState2 = sessionState;
        h.e(sessionState2, "p1");
        return sessionState2.currentUser();
    }
}
