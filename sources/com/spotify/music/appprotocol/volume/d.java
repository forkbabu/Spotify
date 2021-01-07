package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.appprotocol.api.UserIsNotLoggedInException;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (!((SessionState) obj).loggedIn()) {
            return a.t(new UserIsNotLoggedInException());
        }
        return b.a;
    }
}
