package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import com.spotify.podcast.endpoints.i0;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.z;

final class k0 implements i0 {
    private final j0 a;

    public k0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // com.spotify.podcast.endpoints.i0
    public z<i<Episode>> a(i0.a aVar) {
        z<Response> zVar;
        Optional<Policy> h = aVar.h();
        if (h.isPresent()) {
            zVar = this.a.b(aVar.c(), h.get());
        } else {
            zVar = this.a.a(aVar.c());
        }
        return zVar.s(e.a).A(f.a);
    }
}
