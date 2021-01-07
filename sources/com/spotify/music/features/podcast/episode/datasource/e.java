package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.podcast.episode.datasource.x;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ e(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.e(th, "Fail loading episode recommendations for [%s]", this.a);
        return new x.a(th.getMessage());
    }
}
