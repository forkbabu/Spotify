package com.spotify.music.spotlets.radio.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ o(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to create user station with seeds %s", this.a);
    }
}
