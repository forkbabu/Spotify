package com.spotify.playlist.endpoints;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationRequest;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationResponse;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class x implements v {
    private final a a;
    private final w b;
    private final com.spotify.playlist.endpoints.exceptions.a c;

    static final class a<T, R> implements l<PlaylistModificationRequest$ModificationResponse, String> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(PlaylistModificationRequest$ModificationResponse playlistModificationRequest$ModificationResponse) {
            PlaylistModificationRequest$ModificationResponse playlistModificationRequest$ModificationResponse2 = playlistModificationRequest$ModificationResponse;
            h.e(playlistModificationRequest$ModificationResponse2, "obj");
            return playlistModificationRequest$ModificationResponse2.i();
        }
    }

    static final class b<T> implements g<String> {
        final /* synthetic */ x a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ List f;

        b(x xVar, String str, String str2, List list) {
            this.a = xVar;
            this.b = str;
            this.c = str2;
            this.f = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            String str2 = str;
            h.e(str2, "playlistUri");
            this.a.a.b(str2, this.b, this.c);
            this.a.a.a(str2, this.f, this.b, this.c, true);
        }
    }

    public x(a aVar, w wVar, com.spotify.playlist.endpoints.exceptions.a aVar2) {
        h.e(aVar, "mEndpointLogger");
        h.e(wVar, "mCosmosService");
        h.e(aVar2, "mExceptionTransformers");
        this.a = aVar;
        this.b = wVar;
        this.c = aVar2;
    }

    private final io.reactivex.a f(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest) {
        io.reactivex.a t = this.b.c(playlistModificationRequest$ModificationRequest).t(this.c.b());
        h.d(t, "mCosmosService\n         …rmers.completeFunction())");
        return t;
    }

    @Override // com.spotify.playlist.endpoints.v
    public z<String> a(String str, List<String> list, Optional<String> optional, String str2, String str3) {
        z<Response> zVar;
        h.e(str, "name");
        h.e(list, "urisToCreateWith");
        h.e(optional, "folderId");
        h.e(str2, "sourceViewUri");
        h.e(str3, "sourceContextUri");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("create");
        u.w(true);
        u.u(str);
        u.s("start");
        u.n(list);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        if (optional.isPresent()) {
            w wVar = this.b;
            String str4 = optional.get();
            h.d(str4, "folderId.get()");
            h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
            zVar = wVar.a(str4, playlistModificationRequest$ModificationRequest);
        } else {
            w wVar2 = this.b;
            h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
            zVar = wVar2.b(playlistModificationRequest$ModificationRequest);
        }
        z A = zVar.f(this.c.d(PlaylistModificationRequest$ModificationResponse.h())).A(y.a);
        h.d(A, "response.compose(\n      …as ModificationResponse }");
        z<String> p = A.A(a.a).p(new b(this, str2, str3, list));
        h.d(p, "createPlaylistOrFolder(t…tUri, true)\n            }");
        return p;
    }

    @Override // com.spotify.playlist.endpoints.v
    public io.reactivex.a b(String str, boolean z) {
        h.e(str, "uri");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("set");
        u.o(str);
        PlaylistModificationRequest$ModificationRequest.Attributes.a p = PlaylistModificationRequest$ModificationRequest.Attributes.p();
        p.q(z);
        u.r(p);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return f(playlistModificationRequest$ModificationRequest);
    }

    @Override // com.spotify.playlist.endpoints.v
    public io.reactivex.a c(String str) {
        h.e(str, "uri");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("add");
        u.s("start");
        u.p(str);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return f(playlistModificationRequest$ModificationRequest);
    }

    @Override // com.spotify.playlist.endpoints.v
    public io.reactivex.a d(String str) {
        h.e(str, "uri");
        List t = d.t(str);
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("remove");
        u.m(t);
        u.t(false);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return f(playlistModificationRequest$ModificationRequest);
    }
}
