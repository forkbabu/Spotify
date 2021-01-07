package com.spotify.music.autoplay;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.c;

public final /* synthetic */ class o implements c {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        SessionState sessionState = (SessionState) obj;
        ConnectManager.ConnectState connectState = (ConnectManager.ConnectState) obj2;
        boolean z = true;
        boolean z2 = connectState == ConnectManager.ConnectState.ACTIVE || connectState == ConnectManager.ConnectState.CONNECTING;
        if (!sessionState.connected() || z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
