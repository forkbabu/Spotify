package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public final /* synthetic */ String a;

    public /* synthetic */ l(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Fail loading audio plus content for episode [%s]", this.a);
        return f27.a(th.getMessage());
    }
}
