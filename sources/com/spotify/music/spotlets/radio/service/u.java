package com.spotify.music.spotlets.radio.service;

import com.spotify.android.flags.c;
import io.reactivex.functions.g;

public final /* synthetic */ class u implements g {
    public final /* synthetic */ RadioActionsService a;

    public /* synthetic */ u(RadioActionsService radioActionsService) {
        this.a = radioActionsService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c.p((c) obj);
    }
}
