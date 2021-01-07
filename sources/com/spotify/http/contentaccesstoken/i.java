package com.spotify.http.contentaccesstoken;

import com.google.common.base.Optional;
import com.spotify.contentaccesstoken.proto.ContentAccessToken;
import com.spotify.contentaccesstoken.proto.Timestamp;
import io.reactivex.functions.l;
import java.util.List;
import kotlin.jvm.internal.h;

final class i<T, R> implements l<Optional<ContentAccessToken>, Optional<d>> {
    final /* synthetic */ k a;

    i(k kVar) {
        this.a = kVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<d> apply(Optional<ContentAccessToken> optional) {
        Optional<ContentAccessToken> optional2 = optional;
        h.e(optional2, "it");
        this.a.getClass();
        h.e(optional2, "token");
        if (optional2.isPresent()) {
            ContentAccessToken contentAccessToken = optional2.get();
            h.d(contentAccessToken, "token.get()");
            String n = contentAccessToken.n();
            h.d(n, "token.get().token");
            ContentAccessToken contentAccessToken2 = optional2.get();
            h.d(contentAccessToken2, "token.get()");
            Timestamp l = contentAccessToken2.l();
            h.d(l, "token.get().expiresAt");
            long i = l.i();
            ContentAccessToken contentAccessToken3 = optional2.get();
            h.d(contentAccessToken3, "token.get()");
            Timestamp m = contentAccessToken3.m();
            h.d(m, "token.get().refreshAt");
            long i2 = m.i();
            ContentAccessToken contentAccessToken4 = optional2.get();
            h.d(contentAccessToken4, "token.get()");
            List<String> i3 = contentAccessToken4.i();
            h.d(i3, "token.get().domainsList");
            Optional<d> of = Optional.of(new d(n, i, i2, i3));
            h.d(of, "Optional.of(\n           …      )\n                )");
            return of;
        }
        Optional<d> absent = Optional.absent();
        h.d(absent, "Optional.absent()");
        return absent;
    }
}
