package com.spotify.saveaccountinfo;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class c implements n {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((SessionState) obj).loggedIn();
    }
}
