package com.spotify.podcast.endpoints;

import com.spotify.cosmos.router.Response;
import io.reactivex.z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PodcastDecorateEndpointImpl$decorateEpisodes$1 extends FunctionReferenceImpl implements nmf<Response, z<Response>> {
    PodcastDecorateEndpointImpl$decorateEpisodes$1(u uVar) {
        super(1, uVar, u.class, "validateResponseSingle", "validateResponseSingle(Lcom/spotify/cosmos/router/Response;)Lio/reactivex/Single;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public z<Response> invoke(Response response) {
        Response response2 = response;
        h.e(response2, "p1");
        return ((u) this.receiver).b(response2);
    }
}
