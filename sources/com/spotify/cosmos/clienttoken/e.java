package com.spotify.cosmos.clienttoken;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Could not obtain client token. ", new Object[0]);
    }
}
