package com.spotify.music.features.blendinvitation.api;

import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class a {
    private final b a;

    public a(b bVar) {
        h.e(bVar, "endpoint");
        this.a = bVar;
    }

    public final s<InvitationUrl> a() {
        s<InvitationUrl> P = this.a.a().F(new InvitationUrl(null)).P();
        h.d(P, "endpoint\n            .ge…          .toObservable()");
        return P;
    }
}
