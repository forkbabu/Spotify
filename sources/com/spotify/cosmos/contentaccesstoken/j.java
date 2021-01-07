package com.spotify.cosmos.contentaccesstoken;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Could not obtain content access token. Returning an empty optional", new Object[0]);
        return Optional.absent();
    }
}
