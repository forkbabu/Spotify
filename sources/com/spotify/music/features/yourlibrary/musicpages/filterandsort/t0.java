package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.l;

public final /* synthetic */ class t0 implements l {
    public static final /* synthetic */ t0 a = new t0();

    private /* synthetic */ t0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
