package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class r implements l {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
