package com.spotify.music.features.yourlibrary.container.utils;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
