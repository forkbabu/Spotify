package com.spotify.playlist.endpoints;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.u;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.PlaylistEndpointCosmosService;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsRequest;
import com.spotify.playlist.proto.PlaylistContainsRequest$ContainsResponse;
import com.spotify.playlist.proto.PlaylistPlaylistRequest$Collaborator;
import com.spotify.playlist.proto.PlaylistPlaylistRequest$Collaborators;
import com.spotify.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistResponse;
import com.spotify.playlist.proto.PlaylistRequestDecorationPolicy;
import com.spotify.remoteconfig.l9;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class e implements d {
    private static final l<u, d.a> e = a.a;
    public static final b f = new b(null);
    private final cqe a;
    private final PlaylistEndpointCosmosService b;
    private final com.spotify.playlist.endpoints.exceptions.a c;
    private final l9 d;

    static final class a<T, R> implements l<u, d.a> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d.a apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            PlaylistPlaylistRequest$ProtoPlaylistResponse playlistPlaylistRequest$ProtoPlaylistResponse = (PlaylistPlaylistRequest$ProtoPlaylistResponse) uVar2;
            j j = rxd.d(playlistPlaylistRequest$ProtoPlaylistResponse).j();
            PlaylistPlaylistRequest$Collaborators h = playlistPlaylistRequest$ProtoPlaylistResponse.h();
            ArrayList arrayList = new ArrayList();
            h.d(h, "protoCollaborators");
            for (PlaylistPlaylistRequest$Collaborator playlistPlaylistRequest$Collaborator : h.h()) {
                h.d(playlistPlaylistRequest$Collaborator, "collaborator");
                arrayList.add(new d.a.C0369a(rxd.f(playlistPlaylistRequest$Collaborator.n()), playlistPlaylistRequest$Collaborator.h(), playlistPlaylistRequest$Collaborator.l(), playlistPlaylistRequest$Collaborator.m(), playlistPlaylistRequest$Collaborator.i()));
            }
            return new d.a(j.j(), h.i(), kotlin.collections.d.Q(arrayList));
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    static final class c<T, R> implements l<u, d.c> {
        final /* synthetic */ List a;

        c(List list) {
            this.a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d.c apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            PlaylistContainsRequest$ContainsResponse playlistContainsRequest$ContainsResponse = (PlaylistContainsRequest$ContainsResponse) uVar2;
            if (playlistContainsRequest$ContainsResponse.i() == 0) {
                return new d.c(this.a, EmptyList.a);
            }
            List<Boolean> l = playlistContainsRequest$ContainsResponse.l();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < this.a.size() && i < l.size()) {
                if (!l.get(i).booleanValue()) {
                    arrayList.add(this.a.get(i));
                }
                i++;
            }
            return new d.c(this.a, arrayList);
        }
    }

    static final class d<T, R> implements l<u, k> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public k apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            return rxd.d((PlaylistPlaylistRequest$ProtoPlaylistResponse) uVar2);
        }
    }

    /* renamed from: com.spotify.playlist.endpoints.e$e  reason: collision with other inner class name */
    static final class C0371e<T, R> implements l<u, k> {
        public static final C0371e a = new C0371e();

        C0371e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public k apply(u uVar) {
            u uVar2 = uVar;
            h.e(uVar2, "message");
            return rxd.d((PlaylistPlaylistRequest$ProtoPlaylistResponse) uVar2);
        }
    }

    public e(cqe cqe, PlaylistEndpointCosmosService playlistEndpointCosmosService, com.spotify.playlist.endpoints.exceptions.a aVar, l9 l9Var) {
        h.e(cqe, "clock");
        h.e(playlistEndpointCosmosService, "cosmosService");
        h.e(aVar, "exceptionTransformers");
        h.e(l9Var, "properties");
        this.a = cqe;
        this.b = playlistEndpointCosmosService;
        this.c = aVar;
        this.d = l9Var;
    }

    @Override // com.spotify.playlist.endpoints.d
    public s<k> a(String str, d.b bVar) {
        s<Response> sVar;
        h.e(str, "uri");
        h.e(bVar, "configuration");
        if (bVar.k() == null || bVar.i() == null) {
            if (bVar.i() != null) {
                PlaylistEndpointCosmosService playlistEndpointCosmosService = this.b;
                String encode = Uri.encode(str);
                h.d(encode, "Uri.encode(uri)");
                Map<String, String> c2 = o.c(bVar, this.d.a());
                Policy i = bVar.i();
                h.c(i);
                sVar = playlistEndpointCosmosService.e(encode, c2, i);
            } else {
                PlaylistEndpointCosmosService playlistEndpointCosmosService2 = this.b;
                String encode2 = Uri.encode(str);
                h.d(encode2, "Uri.encode(uri)");
                Map<String, String> c3 = o.c(bVar, this.d.a());
                PlaylistRequestDecorationPolicy k = bVar.k();
                if (k == null) {
                    k = PlaylistRequestDecorationPolicy.h();
                    h.d(k, "PlaylistRequestDecoratio…licy.getDefaultInstance()");
                }
                sVar = playlistEndpointCosmosService2.b(encode2, c3, k);
            }
            s<k> j0 = sVar.q(this.c.c(PlaylistPlaylistRequest$ProtoPlaylistResponse.n())).j0(C0371e.a);
            h.d(j0, "observable\n            .…ProtoPlaylistResponse)) }");
            return j0;
        }
        s<k> P = s.P(new UnsupportedOperationException("Only one policy kind is supported. Both .jsonPolicy and .policy was specified. Please use the .policy (protobuf) version."));
        h.d(P, "Observable.error(\n      …NLY_BE_ONE)\n            )");
        return P;
    }

    @Override // com.spotify.playlist.endpoints.d
    public z<d.c> b(String str, List<String> list) {
        h.e(str, "uri");
        h.e(list, "uris");
        PlaylistEndpointCosmosService playlistEndpointCosmosService = this.b;
        String encode = Uri.encode(str);
        h.d(encode, "Uri.encode(uri)");
        PlaylistContainsRequest$ContainsRequest.a i = PlaylistContainsRequest$ContainsRequest.i();
        i.m(list);
        GeneratedMessageLite build = i.build();
        h.d(build, "PlaylistContainsRequest.…addAllItems(uris).build()");
        z<R> A = playlistEndpointCosmosService.c(encode, (PlaylistContainsRequest$ContainsRequest) build).f(this.c.d(PlaylistContainsRequest$ContainsResponse.h())).A(new c(list));
        h.d(A, "cosmosService\n          …ems = uris)\n            }");
        return A;
    }

    @Override // com.spotify.playlist.endpoints.d
    public io.reactivex.a c(String str, d.b bVar, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, String str2, String str3) {
        h.e(str, "uri");
        h.e(bVar, "configuration");
        h.e(preparePlayOptions, "preparePlayOptions");
        h.e(playOrigin, "playOrigin");
        h.e(map, "contextMetadata");
        h.e(str2, "interactionId");
        h.e(str3, "pageInstanceIdentifier");
        Assertion.m(str2.length() > 0, "You must provide a valid interaction ID (from your UBI interaction event). This is important for EndSong logging.", "");
        Assertion.m(str3.length() > 0, "You must provide a valid pageInstance ID (from PageInstanceIdentifierProvider). This is important for EndSong logging.", "");
        PlaylistEndpointCosmosService.PlayPayload playPayload = new PlaylistEndpointCosmosService.PlayPayload(preparePlayOptions, playOrigin, map, LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.a.d())).interactionId(str2).pageInstanceId(str3).build());
        PlaylistEndpointCosmosService playlistEndpointCosmosService = this.b;
        String encode = Uri.encode(str);
        h.d(encode, "Uri.encode(uri)");
        io.reactivex.a t = playlistEndpointCosmosService.d(encode, o.c(bVar, this.d.a()), playPayload).t(this.c.b());
        h.d(t, "cosmosService\n          …rmers.completeFunction())");
        return t;
    }

    @Override // com.spotify.playlist.endpoints.d
    public z<k> d(String str, d.b bVar) {
        z<Response> zVar;
        h.e(str, "uri");
        h.e(bVar, "configuration");
        if (bVar.k() == null || bVar.i() == null) {
            if (bVar.i() != null) {
                PlaylistEndpointCosmosService playlistEndpointCosmosService = this.b;
                String encode = Uri.encode(str);
                h.d(encode, "Uri.encode(uri)");
                Map<String, String> c2 = o.c(bVar, this.d.a());
                Policy i = bVar.i();
                h.c(i);
                zVar = playlistEndpointCosmosService.a(encode, c2, i);
            } else {
                PlaylistEndpointCosmosService playlistEndpointCosmosService2 = this.b;
                String encode2 = Uri.encode(str);
                h.d(encode2, "Uri.encode(uri)");
                Map<String, String> c3 = o.c(bVar, this.d.a());
                PlaylistRequestDecorationPolicy k = bVar.k();
                if (k == null) {
                    k = PlaylistRequestDecorationPolicy.h();
                    h.d(k, "PlaylistRequestDecoratio…licy.getDefaultInstance()");
                }
                zVar = playlistEndpointCosmosService2.f(encode2, c3, k);
            }
            z<k> A = zVar.f(this.c.d(PlaylistPlaylistRequest$ProtoPlaylistResponse.n())).A(d.a);
            h.d(A, "single.compose(\n        …ProtoPlaylistResponse)) }");
            return A;
        }
        z<k> q = z.q(new UnsupportedOperationException("Only one policy kind is supported. Both .jsonPolicy and .policy was specified. Please use the .policy (protobuf) version."));
        h.d(q, "Single.error(\n          …NLY_BE_ONE)\n            )");
        return q;
    }

    @Override // com.spotify.playlist.endpoints.d
    public s<d.a> e(String str, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        h.e(str, "uri");
        h.e(collaboratingUsersDecorationPolicy, "policy");
        d.b.a aVar = new d.b.a(null, null, null, null, null, false, null, false, null, null, null, 0, null, null, 16383);
        Policy.a a2 = Policy.Companion.a();
        DecorationPolicy.a a3 = DecorationPolicy.Companion.a();
        HeaderPolicy.a a4 = HeaderPolicy.Companion.a();
        a4.c(collaboratingUsersDecorationPolicy);
        a4.e(collaboratingUsersDecorationPolicy.collaborator().userAttributes());
        ImmutableMap of = ImmutableMap.of("name", Boolean.TRUE);
        h.d(of, "ImmutableMap.of(\"name\", true)");
        a4.a(of);
        a3.b(a4.b());
        a2.b(a3.a());
        aVar.g(a2.a());
        aVar.i(new qxd(0, 0));
        d.b b2 = aVar.b();
        PlaylistEndpointCosmosService playlistEndpointCosmosService = this.b;
        String encode = Uri.encode(str);
        h.d(encode, "Uri.encode(uri)");
        Map<String, String> c2 = o.c(b2, this.d.a());
        Policy i = b2.i();
        if (i == null) {
            i = new Policy(null, 1, null);
        }
        s<R> j0 = playlistEndpointCosmosService.e(encode, c2, i).q(this.c.c(PlaylistPlaylistRequest$ProtoPlaylistResponse.n())).j0(a.a);
        h.d(j0, "observable\n            .…    .map(toCollaborators)");
        return j0;
    }
}
