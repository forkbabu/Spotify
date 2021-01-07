package com.spotify.mobile.android.spotlets.appprotocol.service;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ AppProtocolRemoteService a;

    public /* synthetic */ g(AppProtocolRemoteService appProtocolRemoteService) {
        this.a = appProtocolRemoteService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.o((Throwable) obj);
    }
}
