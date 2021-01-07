package com.spotify.mobile.android.spotlets.appprotocol.service;

import com.spotify.mobile.android.spotlets.appprotocol.w3;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ AppProtocolRemoteService a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ n(AppProtocolRemoteService appProtocolRemoteService, w3 w3Var) {
        this.a = appProtocolRemoteService;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.m(this.b);
    }
}
