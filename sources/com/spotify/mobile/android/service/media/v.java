package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class v implements g {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Exception while subscribing to RxSessionState & Flags.", new Object[0]);
    }
}
