package com.spotify.podcast.endpoints.collection;

import com.google.common.base.Optional;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.collection.i;
import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import com.spotify.podcast.endpoints.u;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class k implements i {
    private final j a;
    private final u b;

    static final class a<T, R> implements l<Response, d0<? extends Response>> {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Response> apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return this.a.b.b(response2);
        }
    }

    static final class b<T, R> implements l<Response, d0<? extends ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse>> {
        final /* synthetic */ k a;

        b(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            this.a.getClass();
            try {
                z z = z.z(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse.o(response2.getBody()));
                h.d(z, "Single.just(ProtoUnplaye…Response.parseFrom(body))");
                return z;
            } catch (InvalidProtocolBufferException unused) {
                z q = z.q(new UnableToParseMessageException(response2.getUri()));
                h.d(q, "Single.error(UnableToParseMessageException(uri))");
                return q;
            }
        }
    }

    static final class c<T, R> implements l<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse, i<Episode>> {
        final /* synthetic */ k a;

        c(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<Episode> apply(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse) {
            ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2 = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
            h.e(showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2, "it");
            this.a.getClass();
            return tyd.g(showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2);
        }
    }

    static final class d<T, R> implements l<Response, v<? extends Response>> {
        final /* synthetic */ k a;

        d(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Response> apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return this.a.b.a(response2);
        }
    }

    static final class e<T, R> implements l<Response, v<? extends ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse>> {
        final /* synthetic */ k a;

        e(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            this.a.getClass();
            try {
                s i0 = s.i0(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse.o(response2.getBody()));
                h.d(i0, "Observable.just(ProtoUnp…Response.parseFrom(body))");
                return i0;
            } catch (InvalidProtocolBufferException unused) {
                s P = s.P(new UnableToParseMessageException(response2.getUri()));
                h.d(P, "Observable.error(UnableT…rseMessageException(uri))");
                return P;
            }
        }
    }

    static final class f<T, R> implements l<ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse, i<Episode>> {
        final /* synthetic */ k a;

        f(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<Episode> apply(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse) {
            ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2 = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
            h.e(showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2, "it");
            this.a.getClass();
            return tyd.g(showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse2);
        }
    }

    public k(j jVar, u uVar) {
        h.e(jVar, "cosmosService");
        h.e(uVar, "responseValidator");
        this.a = jVar;
        this.b = uVar;
    }

    @Override // com.spotify.podcast.endpoints.collection.i
    public z<i<Episode>> a(String str, i.a aVar) {
        z<Response> zVar;
        h.e(str, "username");
        h.e(aVar, "configuration");
        Optional<CollectionEpisodesPolicy$Policy> b2 = aVar.b();
        if (b2.isPresent()) {
            j jVar = this.a;
            Map<String, String> c2 = aVar.c();
            CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = b2.get();
            h.d(collectionEpisodesPolicy$Policy, "policy.get()");
            zVar = jVar.a(str, c2, collectionEpisodesPolicy$Policy);
        } else {
            zVar = this.a.c(str, aVar.c());
        }
        z<com.spotify.playlist.models.i<Episode>> A = zVar.s(new a(this)).s(new b(this)).A(new c(this));
        h.d(A, "single\n            .flat…p { it.toEpisodeItems() }");
        return A;
    }

    @Override // com.spotify.podcast.endpoints.collection.i
    public s<com.spotify.playlist.models.i<Episode>> b(String str, i.a aVar) {
        s<Response> sVar;
        h.e(str, "username");
        h.e(aVar, "configuration");
        Optional<CollectionEpisodesPolicy$Policy> b2 = aVar.b();
        if (b2.isPresent()) {
            j jVar = this.a;
            Map<String, String> c2 = aVar.c();
            CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = b2.get();
            h.d(collectionEpisodesPolicy$Policy, "policy.get()");
            sVar = jVar.b(str, c2, collectionEpisodesPolicy$Policy);
        } else {
            sVar = this.a.d(str, aVar.c());
        }
        s<com.spotify.playlist.models.i<Episode>> j0 = sVar.W(new d(this), false, Integer.MAX_VALUE).W(new e(this), false, Integer.MAX_VALUE).j0(new f(this));
        h.d(j0, "observable\n            .…p { it.toEpisodeItems() }");
        return j0;
    }
}
