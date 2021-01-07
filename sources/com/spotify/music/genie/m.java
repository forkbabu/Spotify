package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public static final /* synthetic */ m a = new m();

    private /* synthetic */ m() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUserName();
    }
}
