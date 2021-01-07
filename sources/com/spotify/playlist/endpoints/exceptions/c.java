package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c<T, R> implements l<Throwable, Response> {
    final /* synthetic */ Response a;

    c(Response response) {
        this.a = response;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Response apply(Throwable th) {
        h.e(th, "it");
        return this.a;
    }
}
