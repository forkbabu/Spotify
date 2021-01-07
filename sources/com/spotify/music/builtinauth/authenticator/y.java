package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class y implements l {
    public static final /* synthetic */ y a = new y();

    private /* synthetic */ y() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(n0.d((SessionState) obj));
    }
}
