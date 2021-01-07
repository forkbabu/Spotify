package com.spotify.mobile.android.util;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ q0 a;

    public /* synthetic */ l(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.getClass();
        Logger.e((Throwable) obj, "Unable to load web token", new Object[0]);
    }
}
