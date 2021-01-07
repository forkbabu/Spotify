package com.spotify.music.features.radio.fragments;

import com.spotify.mobile.android.service.session.SessionState;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ RadioFragment a;

    public /* synthetic */ g(RadioFragment radioFragment) {
        this.a = radioFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.i5((SessionState) obj);
    }
}
