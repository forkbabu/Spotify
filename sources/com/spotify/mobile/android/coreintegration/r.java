package com.spotify.mobile.android.coreintegration;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RemoteNativeRouter;
import io.reactivex.functions.g;

public final /* synthetic */ class r implements g {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RemoteNativeRouter remoteNativeRouter = (RemoteNativeRouter) obj;
        Logger.g("RemoteNativeRouter emitted", new Object[0]);
    }
}
