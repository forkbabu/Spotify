package com.spotify.music.features.partneraccountlinking;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class h implements n {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return !sessionState.loggingIn() && !sessionState.loggingOut();
    }
}
