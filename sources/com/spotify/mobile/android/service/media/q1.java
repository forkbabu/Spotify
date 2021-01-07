package com.spotify.mobile.android.service.media;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class q1 implements l {
    public static final /* synthetic */ q1 a = new q1();

    private /* synthetic */ q1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).loggedIn());
    }
}
