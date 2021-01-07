package com.spotify.music.features.settings;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class q0 implements l {
    public static final /* synthetic */ q0 a = new q0();

    private /* synthetic */ q0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
