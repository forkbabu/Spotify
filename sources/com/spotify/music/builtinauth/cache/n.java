package com.spotify.music.builtinauth.cache;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public final /* synthetic */ r0 a;

    public /* synthetic */ n(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.getClass();
        Logger.o((Throwable) obj, "Error while updating built-in cache", new Object[0]);
    }
}
