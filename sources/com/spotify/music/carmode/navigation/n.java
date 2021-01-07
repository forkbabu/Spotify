package com.spotify.music.carmode.navigation;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class n implements l {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
