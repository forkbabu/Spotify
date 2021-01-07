package com.spotify.music.features.yourlibrary.container.utils;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ u3 a;

    public /* synthetic */ d(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = this.a;
        Logger.e((Throwable) obj, "error subscribing to profile decoration data", new Object[0]);
        return u3Var;
    }
}
