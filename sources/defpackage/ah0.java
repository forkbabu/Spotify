package defpackage;

import com.spotify.collection.endpoints.artist.policy.Policy;
import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest$ProtoCollectionArtistsResponse;
import com.spotify.playlist.models.i;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: ah0  reason: default package */
public final class ah0 implements xg0 {
    private final wg0 a;
    private final com.spotify.collection.endpoints.artist.json.b b;

    /* renamed from: ah0$a */
    static final class a<T, R> implements l<CollectionArtistsRequest$ProtoCollectionArtistsResponse, i<com.spotify.playlist.models.b>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<com.spotify.playlist.models.b> apply(CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse) {
            CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse2 = collectionArtistsRequest$ProtoCollectionArtistsResponse;
            h.e(collectionArtistsRequest$ProtoCollectionArtistsResponse2, "it");
            return eh0.a(collectionArtistsRequest$ProtoCollectionArtistsResponse2);
        }
    }

    /* renamed from: ah0$b */
    static final class b<T, R> implements l<Response, li0> {
        final /* synthetic */ ah0 a;

        b(ah0 ah0) {
            this.a = ah0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public li0 apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return this.a.b.a(response2);
        }
    }

    /* renamed from: ah0$c */
    static final class c<T, R> implements l<Response, li0> {
        final /* synthetic */ ah0 a;

        c(ah0 ah0) {
            this.a = ah0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public li0 apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return this.a.b.a(response2);
        }
    }

    /* renamed from: ah0$d */
    static final class d<T, R> implements l<CollectionArtistsRequest$ProtoCollectionArtistsResponse, i<com.spotify.playlist.models.b>> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i<com.spotify.playlist.models.b> apply(CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse) {
            CollectionArtistsRequest$ProtoCollectionArtistsResponse collectionArtistsRequest$ProtoCollectionArtistsResponse2 = collectionArtistsRequest$ProtoCollectionArtistsResponse;
            h.e(collectionArtistsRequest$ProtoCollectionArtistsResponse2, "it");
            return eh0.a(collectionArtistsRequest$ProtoCollectionArtistsResponse2);
        }
    }

    public ah0(wg0 wg0, com.spotify.collection.endpoints.artist.json.b bVar) {
        h.e(wg0, "cosmosService");
        h.e(bVar, "artistJsonParser");
        this.a = wg0;
        this.b = bVar;
    }

    @Override // defpackage.xg0
    public s<i<com.spotify.playlist.models.b>> a(Map<String, String> map, Policy policy) {
        h.e(map, "queryMap");
        h.e(policy, "policy");
        s<R> j0 = this.a.a(map, policy).j0(d.a);
        h.d(j0, "cosmosService\n        .o…p { buildArtistList(it) }");
        return j0;
    }

    @Override // defpackage.xg0
    public z<i<com.spotify.playlist.models.b>> b(Map<String, String> map, Policy policy) {
        h.e(map, "queryMap");
        h.e(policy, "policy");
        z<R> A = this.a.b(map, policy).A(a.a);
        h.d(A, "cosmosService\n        .g…p { buildArtistList(it) }");
        return A;
    }

    @Override // defpackage.xg0
    public io.reactivex.a c(String str, yg0 yg0) {
        h.e(str, "artistId");
        h.e(yg0, "configuration");
        z<Response> f = this.a.f(str, yg0.d());
        f.getClass();
        io.reactivex.internal.operators.completable.i iVar = new io.reactivex.internal.operators.completable.i(f);
        h.d(iVar, "cosmosService\n        .m…\n        .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.xg0
    public io.reactivex.a d(String str, yg0 yg0, PlayPayload playPayload) {
        h.e(str, "artistId");
        h.e(yg0, "configuration");
        h.e(playPayload, "playPayload");
        z<Response> d2 = this.a.d(str, yg0.d(), playPayload);
        d2.getClass();
        io.reactivex.internal.operators.completable.i iVar = new io.reactivex.internal.operators.completable.i(d2);
        h.d(iVar, "cosmosService\n          …         .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.xg0
    public s<li0> e(String str, yg0 yg0) {
        h.e(str, "artistId");
        h.e(yg0, "configuration");
        s<R> j0 = this.a.c(str, yg0.d(), yg0.c()).j0(new c(this));
        h.d(j0, "cosmosService\n        .o…ponseToArtistEntity(it) }");
        return j0;
    }

    @Override // defpackage.xg0
    public io.reactivex.a f(String str, yg0 yg0) {
        h.e(str, "artistId");
        h.e(yg0, "configuration");
        z<Response> g = this.a.g(str, yg0.d());
        g.getClass();
        io.reactivex.internal.operators.completable.i iVar = new io.reactivex.internal.operators.completable.i(g);
        h.d(iVar, "cosmosService\n        .m…\n        .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.xg0
    public s<li0> g(String str, yg0 yg0) {
        h.e(str, "artistId");
        h.e(yg0, "configuration");
        s<R> j0 = this.a.e(str, yg0.d(), yg0.c()).j0(new b(this));
        h.d(j0, "cosmosService\n        .o…ponseToArtistEntity(it) }");
        return j0;
    }
}
