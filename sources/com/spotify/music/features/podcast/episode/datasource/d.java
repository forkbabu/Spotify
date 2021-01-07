package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ d(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Fail loading featured content for episode [%s]", this.a);
        return qe7.a(th.getMessage());
    }
}
