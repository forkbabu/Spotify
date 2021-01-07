package com.spotify.playlist.endpoints;

import com.google.protobuf.u;
import com.spotify.playlist.proto.PlaylistModificationRequest$ModificationResponse;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class y<T, R> implements l<u, PlaylistModificationRequest$ModificationResponse> {
    public static final y a = new y();

    y() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public PlaylistModificationRequest$ModificationResponse apply(u uVar) {
        u uVar2 = uVar;
        h.e(uVar2, "message");
        return (PlaylistModificationRequest$ModificationResponse) uVar2;
    }
}
