package com.spotify.podcast.endpoints;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.podcast.endpoints.body.PodcastDecorateBody;
import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import com.spotify.podcast.endpoints.l;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class PodcastDecorateEndpointImpl implements l {
    private final m a;
    private final u b;

    static final class a<T, R> implements l<Response, d0<? extends ShowDecorateRequest$ProtoDecorateResponse>> {
        final /* synthetic */ PodcastDecorateEndpointImpl a;

        a(PodcastDecorateEndpointImpl podcastDecorateEndpointImpl) {
            this.a = podcastDecorateEndpointImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends ShowDecorateRequest$ProtoDecorateResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            return PodcastDecorateEndpointImpl.c(this.a, response2);
        }
    }

    static final class b<T, R> implements l<ShowDecorateRequest$ProtoDecorateResponse, Map<String, ? extends Episode>> {
        final /* synthetic */ PodcastDecorateEndpointImpl a;

        b(PodcastDecorateEndpointImpl podcastDecorateEndpointImpl) {
            this.a = podcastDecorateEndpointImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Map<String, ? extends Episode> apply(ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse) {
            ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse2 = showDecorateRequest$ProtoDecorateResponse;
            h.e(showDecorateRequest$ProtoDecorateResponse2, "response");
            this.a.getClass();
            return tyd.k(showDecorateRequest$ProtoDecorateResponse2);
        }
    }

    static final class c<T, R> implements l<Response, d0<? extends ShowDecorateRequest$ProtoDecorateResponse>> {
        final /* synthetic */ PodcastDecorateEndpointImpl a;

        c(PodcastDecorateEndpointImpl podcastDecorateEndpointImpl) {
            this.a = podcastDecorateEndpointImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends ShowDecorateRequest$ProtoDecorateResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            return PodcastDecorateEndpointImpl.c(this.a, response2);
        }
    }

    static final class d<T, R> implements l<ShowDecorateRequest$ProtoDecorateResponse, Map<String, ? extends Show>> {
        final /* synthetic */ PodcastDecorateEndpointImpl a;

        d(PodcastDecorateEndpointImpl podcastDecorateEndpointImpl) {
            this.a = podcastDecorateEndpointImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Map<String, ? extends Show> apply(ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse) {
            ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse2 = showDecorateRequest$ProtoDecorateResponse;
            h.e(showDecorateRequest$ProtoDecorateResponse2, "response");
            this.a.getClass();
            return tyd.l(showDecorateRequest$ProtoDecorateResponse2);
        }
    }

    public PodcastDecorateEndpointImpl(m mVar, u uVar) {
        h.e(mVar, "cosmosService");
        h.e(uVar, "responseValidator");
        this.a = mVar;
        this.b = uVar;
    }

    public static final z c(PodcastDecorateEndpointImpl podcastDecorateEndpointImpl, Response response) {
        podcastDecorateEndpointImpl.getClass();
        try {
            z z = z.z(ShowDecorateRequest$ProtoDecorateResponse.n(response.getBody()));
            h.d(z, "Single.just(ShowDecorate…Response.parseFrom(body))");
            return z;
        } catch (InvalidProtocolBufferException unused) {
            z q = z.q(new UnableToParseMessageException(response.getUri()));
            h.d(q, "Single.error(UnableToParseMessageException(uri))");
            return q;
        }
    }

    @Override // com.spotify.podcast.endpoints.l
    public z<Map<String, Show>> a(ImmutableList<String> immutableList, l.a aVar) {
        h.e(immutableList, "uris");
        h.e(aVar, "configuration");
        z<R> A = this.a.a(aVar.a(), new PodcastDecorateBody(immutableList)).s(new n(new PodcastDecorateEndpointImpl$decorateShows$1(this.b))).s(new c(this)).A(new d(this));
        h.d(A, "cosmosService.decorate(c…e -> response.toShows() }");
        return A;
    }

    @Override // com.spotify.podcast.endpoints.l
    public z<Map<String, Episode>> b(ImmutableList<String> immutableList, l.a aVar) {
        h.e(immutableList, "uris");
        h.e(aVar, "configuration");
        z<R> A = this.a.a(aVar.a(), new PodcastDecorateBody(immutableList)).s(new n(new PodcastDecorateEndpointImpl$decorateEpisodes$1(this.b))).s(new a(this)).A(new b(this));
        h.d(A, "cosmosService.decorate(c…-> response.toEpisode() }");
        return A;
    }
}
