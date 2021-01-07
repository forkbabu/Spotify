package com.spotify.podcast.endpoints.collection;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.collection.d;
import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import com.spotify.podcast.endpoints.u;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class f implements d {
    private final e a;
    private final u b;

    static final class a<T, R> implements l<Response, d0<? extends Response>> {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Response> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            return this.a.b.b(response2);
        }
    }

    static final class b<T, R> implements l<Response, d0<? extends ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse>> {
        final /* synthetic */ f a;

        b(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            this.a.getClass();
            try {
                z z = z.z(ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse.o(response2.getBody()));
                h.d(z, "Single.just(ProtoOffline…Response.parseFrom(body))");
                return z;
            } catch (InvalidProtocolBufferException unused) {
                z q = z.q(new UnableToParseMessageException(response2.getUri()));
                h.d(q, "Single.error(UnableToParseMessageException(uri))");
                return q;
            }
        }
    }

    static final class c<T, R> implements l<ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse, i<Episode>> {
        final /* synthetic */ f a;

        c(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<Episode> apply(ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse) {
            ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2 = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
            h.e(showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2, "response");
            this.a.getClass();
            i<Episode> e = tyd.e(showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2);
            h.d(e, "FromProtoFactory.create(this)");
            return e;
        }
    }

    static final class d<T, R> implements l<Response, v<? extends Response>> {
        final /* synthetic */ f a;

        d(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Response> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            return this.a.b.a(response2);
        }
    }

    static final class e<T, R> implements l<Response, v<? extends ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse>> {
        final /* synthetic */ f a;

        e(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            this.a.getClass();
            try {
                s i0 = s.i0(ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse.o(response2.getBody()));
                h.d(i0, "Observable.just(ProtoOff…Response.parseFrom(body))");
                return i0;
            } catch (InvalidProtocolBufferException unused) {
                s P = s.P(new UnableToParseMessageException(response2.getUri()));
                h.d(P, "Observable.error(UnableT…rseMessageException(uri))");
                return P;
            }
        }
    }

    /* renamed from: com.spotify.podcast.endpoints.collection.f$f  reason: collision with other inner class name */
    static final class C0378f<T, R> implements l<ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse, i<Episode>> {
        final /* synthetic */ f a;

        C0378f(f fVar) {
            this.a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<Episode> apply(ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse) {
            ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2 = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
            h.e(showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2, "response");
            this.a.getClass();
            i<Episode> e = tyd.e(showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse2);
            h.d(e, "FromProtoFactory.create(this)");
            return e;
        }
    }

    public f(e eVar, u uVar) {
        h.e(eVar, "service");
        h.e(uVar, "responseValidator");
        this.a = eVar;
        this.b = uVar;
    }

    @Override // com.spotify.podcast.endpoints.collection.d
    public s<i<Episode>> a(String str, d.a aVar) {
        s<Response> sVar;
        h.e(str, "username");
        h.e(aVar, "configuration");
        if (aVar.b().isPresent()) {
            e eVar = this.a;
            Map<String, String> c2 = aVar.c();
            CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = aVar.b().get();
            h.d(collectionEpisodesPolicy$Policy, "configuration.policy.get()");
            sVar = eVar.b(str, c2, collectionEpisodesPolicy$Policy);
        } else {
            sVar = this.a.d(str, aVar.c());
        }
        s<i<Episode>> j0 = sVar.W(new d(this), false, Integer.MAX_VALUE).W(new e(this), false, Integer.MAX_VALUE).j0(new C0378f(this));
        h.d(j0, "observable\n            .…sponse.toEpisodeItems() }");
        return j0;
    }

    @Override // com.spotify.podcast.endpoints.collection.d
    public z<i<Episode>> b(String str, d.a aVar) {
        z<Response> zVar;
        h.e(str, "username");
        h.e(aVar, "configuration");
        if (aVar.b().isPresent()) {
            e eVar = this.a;
            Map<String, String> c2 = aVar.c();
            CollectionEpisodesPolicy$Policy collectionEpisodesPolicy$Policy = aVar.b().get();
            h.d(collectionEpisodesPolicy$Policy, "configuration.policy.get()");
            zVar = eVar.a(str, c2, collectionEpisodesPolicy$Policy);
        } else {
            zVar = this.a.c(str, aVar.c());
        }
        z<i<Episode>> A = zVar.s(new a(this)).s(new b(this)).A(new c(this));
        h.d(A, "single\n            .flat…sponse.toEpisodeItems() }");
        return A;
    }
}
