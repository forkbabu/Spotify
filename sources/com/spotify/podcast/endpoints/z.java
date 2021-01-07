package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import com.spotify.podcast.endpoints.x;
import io.reactivex.s;

public class z implements x {
    private final y a;
    private final u b;

    public z(y yVar, u uVar) {
        this.a = yVar;
        this.b = uVar;
    }

    @Override // com.spotify.podcast.endpoints.x
    public s<qyd> a(String str, x.a aVar) {
        s<Response> sVar;
        Optional<ShowPolicy> k = aVar.k();
        if (k.isPresent()) {
            sVar = this.a.a(str, aVar.c(), k.get());
        } else {
            sVar = this.a.b(str, aVar.c());
        }
        u uVar = this.b;
        uVar.getClass();
        return sVar.J0(new a(uVar)).J0(b.a).j0(c.a).J0(d.a);
    }
}
