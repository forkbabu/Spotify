package com.spotify.music.spotlets.radio.service;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.g;

public final /* synthetic */ class v implements g {
    public final /* synthetic */ RadioActionsService a;

    public /* synthetic */ v(RadioActionsService radioActionsService) {
        this.a = radioActionsService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f((SessionState) obj);
    }
}
