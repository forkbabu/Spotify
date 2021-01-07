package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Unable to load tracks to start station : %s", this.a);
    }
}
