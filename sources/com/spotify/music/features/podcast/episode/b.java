package com.spotify.music.features.podcast.episode;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import io.reactivex.internal.util.ExceptionHelper;

public final /* synthetic */ class b implements g {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.o(th, "Error shouldDisableExplicitContent", new Object[0]);
        throw ExceptionHelper.e(th);
    }
}
