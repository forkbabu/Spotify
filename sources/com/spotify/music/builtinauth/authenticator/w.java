package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class w implements n {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return n0.d((SessionState) obj);
    }
}
