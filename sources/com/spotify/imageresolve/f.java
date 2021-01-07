package com.spotify.imageresolve;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("ImageResolve: projection map loading error %s", (Throwable) obj);
    }
}
