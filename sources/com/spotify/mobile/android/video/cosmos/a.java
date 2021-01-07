package com.spotify.mobile.android.video.cosmos;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.n("Stall timer failed", new Object[0]);
    }
}
