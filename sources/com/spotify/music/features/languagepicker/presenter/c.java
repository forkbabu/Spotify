package com.spotify.music.features.languagepicker.presenter;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = ListSubscriber.k;
        Logger.o((Throwable) obj, "Error observing session state changes", new Object[0]);
    }
}
