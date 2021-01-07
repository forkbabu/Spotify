package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Fail loading episode tracklist for [%s]", this.a);
        return y87.a(th.getMessage());
    }
}
