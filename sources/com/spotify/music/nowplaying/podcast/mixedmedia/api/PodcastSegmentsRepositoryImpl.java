package com.spotify.music.nowplaying.podcast.mixedmedia.api;

import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.c;
import com.spotify.podcast.endpoints.v;
import kotlin.jvm.internal.h;

public final class PodcastSegmentsRepositoryImpl implements a {
    private final nmf<a, nmf<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, c>> a = new PodcastSegmentsRepositoryImpl$responseToModelMapperProvider$1(this);
    private final nmf<a, PodcastSegmentsCosmosRequest$PodcastSegmentsRequest> b = PodcastSegmentsRepositoryImpl$basePodcastSegmentsRequestBuilder$1.a;
    private final v c;

    public PodcastSegmentsRepositoryImpl(v vVar) {
        h.e(vVar, "service");
        this.c = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.spotify.music.nowplaying.podcast.mixedmedia.api.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.api.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<com.spotify.music.nowplaying.podcast.mixedmedia.model.c> a(com.spotify.music.nowplaying.podcast.mixedmedia.model.a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "episodeUri"
            kotlin.jvm.internal.h.e(r3, r0)
            com.spotify.podcast.endpoints.v r0 = r2.c
            nmf<com.spotify.music.nowplaying.podcast.mixedmedia.model.a, com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest> r1 = r2.b
            java.lang.Object r1 = r1.invoke(r3)
            com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest r1 = (com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) r1
            io.reactivex.z r0 = r0.a(r1)
            nmf<com.spotify.music.nowplaying.podcast.mixedmedia.model.a, nmf<com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, com.spotify.music.nowplaying.podcast.mixedmedia.model.c>> r1 = r2.a
            java.lang.Object r3 = r1.invoke(r3)
            nmf r3 = (defpackage.nmf) r3
            if (r3 == 0) goto L_0x0023
            com.spotify.music.nowplaying.podcast.mixedmedia.api.b r1 = new com.spotify.music.nowplaying.podcast.mixedmedia.api.b
            r1.<init>(r3)
            r3 = r1
        L_0x0023:
            io.reactivex.functions.l r3 = (io.reactivex.functions.l) r3
            io.reactivex.z r3 = r0.A(r3)
            java.lang.String r0 = "service\n            .get…pperProvider(episodeUri))"
            kotlin.jvm.internal.h.d(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.podcast.mixedmedia.api.PodcastSegmentsRepositoryImpl.a(com.spotify.music.nowplaying.podcast.mixedmedia.model.a):io.reactivex.z");
    }
}
