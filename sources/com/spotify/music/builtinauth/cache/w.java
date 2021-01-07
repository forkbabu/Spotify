package com.spotify.music.builtinauth.cache;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class w implements l {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SessionState sessionState = (SessionState) obj;
        return Boolean.TRUE;
    }
}
