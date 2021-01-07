package com.spotify.playlist.endpoints;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.a;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationRequest;
import com.spotify.playlist.proto.SyncRequest;
import io.reactivex.z;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class k implements i {
    private final a a;
    private final j b;
    private final a c;

    public k(a aVar, j jVar, a aVar2) {
        h.e(aVar, "endpointLogger");
        h.e(jVar, "cosmosService");
        h.e(aVar2, "exceptionTransformers");
        this.a = aVar;
        this.b = jVar;
        this.c = aVar2;
    }

    private final io.reactivex.a k(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        j jVar = this.b;
        String encode = Uri.encode(str);
        h.d(encode, "Uri.encode(uri)");
        io.reactivex.a t = jVar.b(encode, playlistModificationRequest$ModificationRequest).t(this.c.b());
        h.d(t, "cosmosService\n          …rmers.completeFunction())");
        return t;
    }

    private final io.reactivex.a l(String str, PlaylistModificationRequest$ModificationRequest.Attributes.a aVar) {
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("set");
        u.r(aVar);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return k(playlistModificationRequest$ModificationRequest, str);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a a(String str, List<String> list) {
        h.e(str, "uri");
        h.e(list, "rowIds");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("remove");
        u.m(list);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return k(playlistModificationRequest$ModificationRequest, str);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a b(String str, boolean z) {
        h.e(str, "uri");
        PlaylistModificationRequest$ModificationRequest.Attributes.a p = PlaylistModificationRequest$ModificationRequest.Attributes.p();
        p.m(z);
        h.d(p, "Attributes.newBuilder().…laborative(collaborative)");
        return l(str, p);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a c(String str, Optional<ane> optional, boolean z) {
        z<Response> zVar;
        h.e(str, "uri");
        h.e(optional, "sortOrder");
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (optional.isPresent()) {
                ane ane = optional.get();
                h.d(ane, "sortOrder.get()");
                linkedHashMap.put("sort", bne.b(ane));
            }
            j jVar = this.b;
            String encode = Uri.encode(str);
            h.d(encode, "Uri.encode(uri)");
            zVar = jVar.d(encode, linkedHashMap);
        } else {
            j jVar2 = this.b;
            String encode2 = Uri.encode(str);
            h.d(encode2, "Uri.encode(uri)");
            zVar = jVar2.c(encode2);
        }
        io.reactivex.a t = zVar.t(this.c.b());
        h.d(t, "single.flatMapCompletabl…rmers.completeFunction())");
        return t;
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a d(String str) {
        h.e(str, "uri");
        List t = d.t(str);
        h.e(t, "uris");
        j jVar = this.b;
        SyncRequest.b i = SyncRequest.i();
        i.m(t);
        GeneratedMessageLite build = i.build();
        h.d(build, "SyncRequest.newBuilder()…laylistUris(uris).build()");
        io.reactivex.a t2 = jVar.a((SyncRequest) build).t(this.c.b());
        h.d(t2, "cosmosService\n          …rmers.completeFunction())");
        return t2;
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a e(String str, List<String> list, String str2, String str3) {
        h.e(str, "uri");
        h.e(list, "itemUris");
        h.e(str2, "sourceViewUri");
        h.e(str3, "sourceContextUri");
        h.e(str, "uri");
        h.e(list, "itemUris");
        h.e("end", "rowIdOfItemToAddAfter");
        h.e(str2, "sourceViewUri");
        h.e(str3, "sourceContextUri");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("add");
        u.q("end");
        u.n(list);
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        this.a.a(str, list, str2, str3, false);
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return k(playlistModificationRequest$ModificationRequest, str);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a f(String str, String str2) {
        h.e(str, "uri");
        h.e(str2, "id");
        PlaylistModificationRequest$ModificationRequest.Attributes.a p = PlaylistModificationRequest$ModificationRequest.Attributes.p();
        p.p(str2);
        h.d(p, "Attributes.newBuilder().setPicture(id)");
        return l(str, p);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a g(String str, String str2) {
        h.e(str, "uri");
        h.e(str2, "name");
        PlaylistModificationRequest$ModificationRequest.Attributes.a p = PlaylistModificationRequest$ModificationRequest.Attributes.p();
        p.o(str2);
        h.d(p, "Attributes.newBuilder().setName(name)");
        return l(str, p);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a h(String str, List<String> list, Optional<String> optional) {
        h.e(str, "uri");
        h.e(list, "rowIdsOfItemsToMove");
        h.e(optional, "rowIdOfItemToMoveAfter");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("move");
        u.m(list);
        optional.or((Optional<String>) "end");
        u.q("end");
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return k(playlistModificationRequest$ModificationRequest, str);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a i(String str, List<String> list, Optional<String> optional) {
        h.e(str, "uri");
        h.e(list, "rowIdsOfItemsToMove");
        h.e(optional, "rowIdOfItemToMoveBefore");
        PlaylistModificationRequest$ModificationRequest.a u = PlaylistModificationRequest$ModificationRequest.u();
        u.v("move");
        u.m(list);
        u.s(optional.or((Optional<String>) "start"));
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) u.build();
        h.d(playlistModificationRequest$ModificationRequest, "modificationRequest");
        return k(playlistModificationRequest$ModificationRequest, str);
    }

    @Override // com.spotify.playlist.endpoints.i
    public io.reactivex.a j(String str, String str2) {
        h.e(str, "uri");
        h.e(str2, "description");
        PlaylistModificationRequest$ModificationRequest.Attributes.a p = PlaylistModificationRequest$ModificationRequest.Attributes.p();
        p.n(str2);
        h.d(p, "Attributes.newBuilder().…tDescription(description)");
        return l(str, p);
    }
}
