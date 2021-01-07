package com.spotify.mobile.android.spotlets.appprotocol.service;

import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ AppProtocolRemoteService a;

    public /* synthetic */ j(AppProtocolRemoteService appProtocolRemoteService) {
        this.a = appProtocolRemoteService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.n((Boolean) obj);
    }
}
