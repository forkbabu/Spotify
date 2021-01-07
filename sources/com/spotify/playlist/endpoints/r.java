package com.spotify.playlist.endpoints;

import com.google.common.base.Optional;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import com.spotify.playlist.proto.OfflinePlaylistContainingItem;
import com.spotify.playlist.proto.OfflinePlaylistsContainingItemResponse;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsRequest;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsResponse;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootResponse;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class r implements p {
    private final q a;
    private final com.spotify.playlist.endpoints.exceptions.a b;

    static final class a<T, R> implements l<u, List<? extends Boolean>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends Boolean> apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            return ((PlaylistContainsRequest$ContainsResponse) uVar2).l();
        }
    }

    static final class b<T, R> implements l<u, f> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            return rxd.g((PlaylistRootlistRequest$ProtoPlaylistRootResponse) uVar2);
        }
    }

    static final class c<T, R> implements l<u, List<? extends p.b>> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends p.b> apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            List<OfflinePlaylistContainingItem> i = ((OfflinePlaylistsContainingItemResponse) uVar2).i();
            h.d(i, "(message as OfflinePlayl…emResponse).playlistsList");
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(i, 10));
            for (T t : i) {
                h.d(t, "item");
                String h = t.h();
                h.d(h, "item.playlistLink");
                String i2 = t.i();
                h.d(i2, "item.playlistName");
                arrayList.add(new p.b(h, i2));
            }
            return arrayList;
        }
    }

    static final class d<T, R> implements l<u, f> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            return rxd.g((PlaylistRootlistRequest$ProtoPlaylistRootResponse) uVar2);
        }
    }

    public r(q qVar, com.spotify.playlist.endpoints.exceptions.a aVar) {
        h.e(qVar, "mCosmosService");
        h.e(aVar, "mExceptionTransformers");
        this.a = qVar;
        this.b = aVar;
    }

    @Override // com.spotify.playlist.endpoints.p
    public z<List<p.b>> a(String str) {
        h.e(str, "itemUri");
        z<R> A = this.a.a(str).f(this.b.d(OfflinePlaylistsContainingItemResponse.h())).A(c.a);
        h.d(A, "mCosmosService\n         …          }\n            }");
        return A;
    }

    @Override // com.spotify.playlist.endpoints.p
    public z<f> b(Optional<String> optional, p.a aVar) {
        z<Response> zVar;
        h.e(optional, "folderId");
        h.e(aVar, "configuration");
        if (aVar.g() != null) {
            z<f> q = z.q(new UnsupportedOperationException("Protobuf policy not yet implemented. Use jsonPolicy() for now."));
            h.d(q, "Single.error(\n          …          )\n            )");
            return q;
        }
        RootlistRequestPayload f = aVar.f();
        if (f == null) {
            RootlistRequestPayload.Companion.getClass();
            f = new RootlistRequestPayload.a(null, 1).a();
        }
        Map<String, String> d2 = o.d(aVar);
        if (optional.isPresent()) {
            q qVar = this.a;
            String str = optional.get();
            h.d(str, "folderId.get()");
            zVar = qVar.d(str, d2, f);
        } else {
            zVar = this.a.c(d2, f);
        }
        z<f> A = zVar.f(this.b.d(PlaylistRootlistRequest$ProtoPlaylistRootResponse.h())).A(b.a);
        h.d(A, "single.compose(mExceptio…oPlaylistRootResponse)) }");
        return A;
    }

    @Override // com.spotify.playlist.endpoints.p
    public z<List<Boolean>> c(List<String> list) {
        h.e(list, "uris");
        q qVar = this.a;
        PlaylistContainsRequest$ContainsRequest.a i = PlaylistContainsRequest$ContainsRequest.i();
        i.m(list);
        GeneratedMessageLite build = i.build();
        h.d(build, "PlaylistContainsRequest.…                 .build()");
        z<R> A = qVar.e((PlaylistContainsRequest$ContainsRequest) build).f(this.b.d(PlaylistContainsRequest$ContainsResponse.h())).A(a.a);
        h.d(A, "mCosmosService\n         …).foundList\n            }");
        return A;
    }

    @Override // com.spotify.playlist.endpoints.p
    public s<f> d(Optional<String> optional, p.a aVar) {
        s<Response> sVar;
        h.e(optional, "folderId");
        h.e(aVar, "configuration");
        if (aVar.g() != null) {
            s<f> P = s.P(new UnsupportedOperationException("Protobuf policy not yet implemented. Use jsonPolicy() for now."));
            h.d(P, "Observable.error(\n      …          )\n            )");
            return P;
        }
        RootlistRequestPayload f = aVar.f();
        if (f == null) {
            RootlistRequestPayload.Companion.getClass();
            f = new RootlistRequestPayload.a(null, 1).a();
        }
        Map<String, String> d2 = o.d(aVar);
        if (optional.isPresent()) {
            q qVar = this.a;
            String str = optional.get();
            h.d(str, "folderId.get()");
            sVar = qVar.b(str, d2, f);
        } else {
            sVar = this.a.f(d2, f);
        }
        s<f> j0 = sVar.q(this.b.c(PlaylistRootlistRequest$ProtoPlaylistRootResponse.h())).j0(d.a);
        h.d(j0, "single.compose(\n        …oPlaylistRootResponse)) }");
        return j0;
    }
}
