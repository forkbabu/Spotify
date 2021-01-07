package com.spotify.music.storylines.service;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = StorylinesUrisFetcher.w;
        Logger.e((Throwable) obj, "Error saving Storylines cache", new Object[0]);
    }
}
