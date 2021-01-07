package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
public final /* synthetic */ class PodcastMoreForYouDataLoader$fetch$1 extends FunctionReferenceImpl implements nmf<v<e0>, h> {
    PodcastMoreForYouDataLoader$fetch$1(d dVar) {
        super(1, dVar, d.class, "parse", "parse(Lretrofit2/Response;)Lcom/spotify/music/nowplaying/scroll/widgets/podcastmoreforyou/network/PodcastMoreForYouResponse;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public h invoke(v<e0> vVar) {
        v<e0> vVar2 = vVar;
        h.e(vVar2, "p1");
        return ((d) this.receiver).a(vVar2);
    }
}
