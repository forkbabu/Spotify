package com.spotify.http.clienttoken;

import com.google.common.base.Optional;
import com.spotify.cosmos.clienttoken.model.ClientToken;
import io.reactivex.functions.l;
import java.util.List;

final class h<T, R> implements l<Optional<ClientToken>, Optional<a>> {
    final /* synthetic */ k a;

    h(k kVar) {
        this.a = kVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<a> apply(Optional<ClientToken> optional) {
        Optional<ClientToken> optional2 = optional;
        kotlin.jvm.internal.h.e(optional2, "it");
        this.a.getClass();
        kotlin.jvm.internal.h.e(optional2, "token");
        if (optional2.isPresent()) {
            String clientToken = optional2.get().clientToken();
            kotlin.jvm.internal.h.d(clientToken, "token.get().clientToken()");
            long expiresAtTime = optional2.get().expiresAtTime();
            long refreshAtTime = optional2.get().refreshAtTime();
            String clientDataHash = optional2.get().clientDataHash();
            kotlin.jvm.internal.h.d(clientDataHash, "token.get().clientDataHash()");
            List<String> domains = optional2.get().domains();
            kotlin.jvm.internal.h.d(domains, "token.get().domains()");
            Optional<a> of = Optional.of(new a(clientToken, expiresAtTime, refreshAtTime, clientDataHash, domains));
            kotlin.jvm.internal.h.d(of, "Optional.of(\n           …          )\n            )");
            return of;
        }
        Optional<a> absent = Optional.absent();
        kotlin.jvm.internal.h.d(absent, "Optional.absent()");
        return absent;
    }
}
