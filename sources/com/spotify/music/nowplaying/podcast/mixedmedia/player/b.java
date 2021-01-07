package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import defpackage.zwd;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<zwd, d0<? extends zwd>> {
    final /* synthetic */ PodcastMixedMediaPlayerHelperImpl a;

    b(PodcastMixedMediaPlayerHelperImpl podcastMixedMediaPlayerHelperImpl) {
        this.a = podcastMixedMediaPlayerHelperImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends zwd> apply(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "result");
        if (zwd2 instanceof zwd.b) {
            return this.a.b();
        }
        z z = z.z(zwd2);
        h.d(z, "Single.just(result)");
        return z;
    }
}
