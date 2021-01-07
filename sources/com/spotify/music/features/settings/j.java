package com.spotify.music.features.settings;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ u3 a;

    public /* synthetic */ j(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = this.a;
        int i = SettingsFragment.m1;
        Logger.e((Throwable) obj, "error subscribing to profile decoration data", new Object[0]);
        return u3Var;
    }
}
