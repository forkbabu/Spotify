package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.n;

public final /* synthetic */ class x implements n {
    public static final /* synthetic */ x a = new x();

    private /* synthetic */ x() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return n0.b((SessionState) obj);
    }
}
