package com.spotify.music.features.partneraccountlinking.dialog;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class l implements n {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((SessionState) obj).loggedIn();
    }
}
