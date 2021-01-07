package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class r<T, R> implements l<Throwable, i> {
    public static final r a = new r();

    r() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "t");
        String message = th2.getMessage();
        if (message == null) {
            message = "Unknown Error";
        }
        return new i.a(message);
    }
}
