package com.spotify.http.clienttoken;

import com.spotify.http.clienttoken.ClientTokenProvider;
import kotlin.jvm.internal.h;

public final class e implements ClientTokenProvider {
    private final d a;
    private final g b;

    public e(g gVar, cqe cqe) {
        h.e(gVar, "clientTokenRequester");
        h.e(cqe, "clock");
        this.b = gVar;
        this.a = new d(gVar, cqe);
    }

    @Override // com.spotify.http.clienttoken.ClientTokenProvider
    public a a(int i) {
        a c = this.a.c(i);
        if (c != null) {
            return c;
        }
        throw new ClientTokenProvider.ClientTokenException("Client token unavailable");
    }

    @Override // com.spotify.http.clienttoken.ClientTokenProvider
    public void reset() {
        if (this.a.a() != null) {
            this.b.cancel();
            this.a.b();
        }
    }
}
