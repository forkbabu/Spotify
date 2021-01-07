package com.spotify.podcast.endpoints;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest$ProtoShowsResponse;
import com.spotify.podcast.endpoints.c0;
import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$Policy;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class e0 implements c0 {
    private final d0 a;
    private final u b;

    static final class a<T, R> implements l<Response, v<? extends Response>> {
        final /* synthetic */ e0 a;

        a(e0 e0Var) {
            this.a = e0Var;
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

    static final class b<T, R> implements l<Response, v<? extends ShowShowsRequest$ProtoShowsResponse>> {
        final /* synthetic */ e0 a;

        b(e0 e0Var) {
            this.a = e0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends ShowShowsRequest$ProtoShowsResponse> apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            this.a.getClass();
            try {
                s i0 = s.i0(ShowShowsRequest$ProtoShowsResponse.p(response2.getBody()));
                h.d(i0, "Observable.just(ShowShow…Response.parseFrom(body))");
                return i0;
            } catch (InvalidProtocolBufferException unused) {
                s P = s.P(new UnableToParseMessageException(response2.getUri()));
                h.d(P, "Observable.error(UnableT…rseMessageException(uri))");
                return P;
            }
        }
    }

    static final class c<T, R> implements l<ShowShowsRequest$ProtoShowsResponse, ryd> {
        final /* synthetic */ e0 a;

        c(e0 e0Var) {
            this.a = e0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ryd apply(ShowShowsRequest$ProtoShowsResponse showShowsRequest$ProtoShowsResponse) {
            ShowShowsRequest$ProtoShowsResponse showShowsRequest$ProtoShowsResponse2 = showShowsRequest$ProtoShowsResponse;
            h.e(showShowsRequest$ProtoShowsResponse2, "response");
            this.a.getClass();
            return tyd.j(showShowsRequest$ProtoShowsResponse2);
        }
    }

    public e0(d0 d0Var, u uVar) {
        h.e(d0Var, "cosmosService");
        h.e(uVar, "responseValidator");
        this.a = d0Var;
        this.b = uVar;
    }

    @Override // com.spotify.podcast.endpoints.c0
    public s<ryd> a(String str, c0.a aVar) {
        s<Response> sVar;
        h.e(str, "username");
        h.e(aVar, "configuration");
        if (aVar.b().isPresent()) {
            d0 d0Var = this.a;
            Map<String, String> a2 = aVar.a();
            ShowsPolicy$Policy showsPolicy$Policy = aVar.b().get();
            h.d(showsPolicy$Policy, "configuration.showPolicy.get()");
            sVar = d0Var.a(str, a2, showsPolicy$Policy);
        } else {
            sVar = this.a.b(str, aVar.a());
        }
        s<ryd> j0 = sVar.W(new a(this), false, Integer.MAX_VALUE).W(new b(this), false, Integer.MAX_VALUE).j0(new c(this));
        h.d(j0, "observable\n            .…e -> response.toShows() }");
        return j0;
    }
}
