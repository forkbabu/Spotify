package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).loggedIn());
    }
}
