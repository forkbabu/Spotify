package com.spotify.mobile.android.spotlets.appprotocol.service;

import com.spotify.mobile.android.spotlets.appprotocol.w3;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ AppProtocolRemoteService a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w3 c;

    public /* synthetic */ f(AppProtocolRemoteService appProtocolRemoteService, boolean z, w3 w3Var) {
        this.a = appProtocolRemoteService;
        this.b = z;
        this.c = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.b, this.c);
    }
}
