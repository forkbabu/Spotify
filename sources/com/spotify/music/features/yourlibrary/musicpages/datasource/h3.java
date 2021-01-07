package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class h3 implements l {
    public static final /* synthetic */ h3 a = new h3();

    private /* synthetic */ h3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
